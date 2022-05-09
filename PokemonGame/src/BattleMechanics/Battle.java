package BattleMechanics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Interfaces.GlobalVariables;
import Moveset.OtherDamage.ConfusionDamage;
import Moveset.OtherDamage.NoMove;
import Moveset.OtherDamage.Struggle;
import PlayerMechanics.*;
import PokemonCreation.Abilities;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;
import Terrain.Terrain;
import Weather.Weather;
import Items.NoItem;

import static Interfaces.GetPokemon.evolvePoke;

public class Battle {
    private String type;
    private List<Pokemon> CurrentParty;
    private List<Pokemon> Graveyard = new ArrayList<>();
    private List<Pokemon> Waiting;
    private List<Pokemon> ExpLineUp = new ArrayList<>();
    private Pokemon PlayerPoke;
    private List<Pokemon> AIParty;
    private Pokemon AIPoke;
    private Weather weather;
    private PlayerParty party;
    private BallInventory ballInventory;
    private Computer computer;
    private AreaMechanics areaType;
    private int sleepTimer = 0;
    private int playerChargeTimer = 0;
    private int AIChargeTimer = 0;
    private Weather savedWeather;
    private int weatherTicker = 0;
    private Terrain terrain;
    private int terrainTicker = 0;
    private final Terrain savedTerrain;
    private Moves playerForcedMove = new NoMove();
    private Moves AIForcedMove = new NoMove();
    private Moves PlayerSelectedMove = new NoMove();
    private Moves AISelectedMove = new NoMove();
    private GlobalVariables globalVariables;
    private Items playerItemUsed = null;
    private Items AIItemUsed = null;
    private int playerFutureDamage = 0;
    private int AIFutureDamage = 0;
    private int playerFutureDamageTimer = 0;
    private int AiFutureDamageTimer = 0;
    private final Moves placeHolderMove = new NoMove();
    private final AffectsGround affectsGround = new AffectsGround();
    private int isTrickRoom = 0;
    private Boolean isFirst = false;
    private int magicRoomTimer = 0;

    public Battle(GlobalVariables globalVariables, String type, ArrayList<Pokemon> AIParty) {
        this.type = type;
        this.party = globalVariables.getParty();
        this.CurrentParty = party.getCurrentParty();
        this.ballInventory = globalVariables.getBallInventory();
        for (Pokemon pokemon : CurrentParty){
            if(pokemon.showHP() <= 0){
                CurrentParty.remove(pokemon);
                Graveyard.add(pokemon);
            }
        }
        this.Waiting = this.CurrentParty;
        this.weather = globalVariables.getWeather();
        this.AIParty = AIParty;
        this.computer = globalVariables.getComputer();
        this.areaType = globalVariables.getAreaType();
        this.savedWeather = this.weather;
        this.terrain = globalVariables.getTerrain();
        this.savedTerrain = this.terrain;
        this.globalVariables = globalVariables;
    }

    private Pokemon ThrowPoke() {
        boolean again = true;
        while (again) {
            System.out.println("Which Pokemon are you throwing out?");
            System.out.println("Available Pokemon- ");
            Scanner scan = new Scanner(System.in);
            List<String> names = new ArrayList<>();
            List<String> tickerList = new ArrayList<>();
            int ticker = 0;
            String stringTicker = "";
            for (Pokemon pokemon : Waiting) {
                ticker += 1;
                stringTicker = Integer.toString(ticker);
                tickerList.add(stringTicker);
                names.add(pokemon.showName());
                if (!pokemon.showType2().equals("")) {
                    System.out.println(pokemon.showName() + " (" + stringTicker + ")" + " is level " + pokemon.showLevel() + " and types " + pokemon.showType1() + " and " + pokemon.showType2());
                }
                if (pokemon.showType2().equals("")) {
                    System.out.println(pokemon.showName() + " (" + stringTicker + ")" + " is level " + pokemon.showLevel() + " and type " + pokemon.showType1());
                }
            }
            String Throw = scan.nextLine();
            if ((names.contains(Throw)) || (tickerList.contains(Throw))) {
                boolean isTicker = false;
                int chosenTicker = 0;
                if (tickerList.contains(Throw)) {
                    isTicker = true;
                    chosenTicker = Integer.parseInt(Throw);
                }
                for (Pokemon pokemon : Waiting) {
                    if (pokemon.showName().equals(Throw)) {
                        System.out.println(pokemon.showName() + " knows:");
                        for (Moves moves : pokemon.showMoves()) {
                            System.out.println(moves.showName() + ", a " + moves.showType() + " move with " + moves.showPP() + " PP left.");
                        }
                        System.out.println("Would you like to throw out " + pokemon.showName() + "? (y/n)");
                        String Confirm = scan.nextLine();
                        if (Confirm.equals("y")) {
                            return pokemon;
                        }
                       else {
                            System.out.println("Returning to selection screen.");
                        }
                    }
                    if (isTicker) {
                        if (Waiting.get(chosenTicker - 1) == pokemon) {
                            System.out.println(pokemon.showName() + " knows:");
                            for (Moves moves : pokemon.showMoves()) {
                                System.out.println(moves.showName() + ", a " + moves.showType() + " move with " + moves.showPP() + " PP left.");
                            }
                            System.out.println("Would you like to throw out " + pokemon.showName() + "? (y/n)");
                            String Confirm = scan.nextLine();
                            if (Confirm.equals("y")) {
                                pokemon.setJustThrown();
                                return pokemon;
                            }
                            else {
                                System.out.println("Returning to selection screen.");
                            }
                        }
                    }
                }
            }
        System.out.println("Not in your party.");
        }
        return null;
    }
    private String selectAction(){
        Scanner scan = new Scanner(System.in);
        String choice = "y";
        String Selecting = "y";
        if(this.PlayerPoke.getIsOutraged()){
            System.out.println("Your " + this.PlayerPoke.showName() + " is still using its last move!");
            return ("7");
        }
        while(Selecting.equals("y")) {
            List<String> selections = new ArrayList<>();
            System.out.println("Would you like to:");
            System.out.println("Use a move [1]");
            selections.add("1");
            System.out.println("Use an item [2]");
            selections.add("2");
            System.out.println("Switch out to another pokemon [3]");
            selections.add("3");
            if (type.equals("Wild")) {
                System.out.println("Attempt to capture [4]");
                selections.add("4");
                System.out.println("Flee [5]");
                selections.add("5");
            }
            choice = scan.nextLine();
            if (selections.contains(choice)) {
                Selecting = "n";
                Boolean Ballcheck2 = false;
                if (choice.equals("4")) {
                    int Balls = 0;
                    while (Balls < 22) {
                        if (ballInventory.showballAm().get(Balls) > 0) {
                            Ballcheck2 = true;
                        }
                        Balls += 1;
                    }
                    if (!Ballcheck2) {
                        Selecting = "y";
                        System.out.println("You have no pokeballs!");
                    }
                }
                if(choice.equals("1")){
                    if(PlayerPoke.getForcedSitOut()){
                        System.out.println("Your " + PlayerPoke.showName() + " cannot move!");
                        System.out.println("Do you wish to do nothing? (y/n)");
                        String nothing = scan.nextLine();
                        if(nothing.equals("y")){
                            return "6";
                        }
                    }
                }
                if(choice.equals("4")){
                    if(PlayerPoke.showVortexMove()){
                        System.out.println("Your " + PlayerPoke.showName() + " is trapped due to the vortex!");
                        Selecting = "y";
                    }
                }
            }
        }
        this.PlayerPoke.resetForcedSitOut();
        return choice;
    }

    private void nonuseMove(Moves AISelectedMove){
        System.out.println("Enemy " + AIPoke.showName() + " uses " + AISelectedMove.showName());
        Turn(this.AIPoke, this.PlayerPoke, AISelectedMove);
        if(this.PlayerPoke.showHP() > 0) {
            if (this.PlayerPoke.showAbility().showHealWeather()
                || this.PlayerPoke.showAbility().getHealOnType()){
                int Healing = PlayerPoke.showAbility().Heal(weather.showName(), PlayerPoke.showSavedHP(), AISelectedMove);
                if (!(Healing == 1)) {
                    System.out.println("Your " + PlayerPoke.showName() + " healed for " + Healing + " because of its " + PlayerPoke.showAbility().showName());
                    PlayerPoke.changeHP(-1 * Healing);
                }
            }
            if (AIPoke.showAbility().showHealWeather() ||
                AIPoke.showAbility().getHealOnType()){
                int Healing = AIPoke.showAbility().Heal(weather.showName(), AIPoke.showSavedHP(), this.PlayerSelectedMove);
                if (!(Healing == 1)) {
                    System.out.println("Enemy " + AIPoke.showName() + " healed for " + Healing + " because of its " + AIPoke.showAbility().showName());
                    AIPoke.changeHP(-1 * Healing);
                }
            }
        }
    }

    private void useMove(Moves AISelectedMove, String choice){
        this.isFirst = isFirst();
        if(this.isFirst){
            this.PlayerPoke.setIsFirst(true);
            this.AIPoke.setIsFirst(false);
        }
        else {
            this.PlayerPoke.setIsFirst(false);
            this.AIPoke.setIsFirst(true);
        }
        this.PlayerSelectedMove = new NoMove();
        if(!choice.equals("6") && !choice.equals("7")) {
            this.PlayerSelectedMove = SelectMove();
            if(this.PlayerPoke.getTormented()){
                while (this.PlayerSelectedMove ==
                        this.playerForcedMove) {
                    System.out.println("Torment forces you to use a new move every turn!");
                    this.PlayerSelectedMove = SelectMove();
                }
            }
        }
        if(choice.equals("7")){
            PlayerSelectedMove = playerForcedMove;
        }
        if(PlayerSelectedMove.getDoesEnemyMove()) {
            double poweredUp = PlayerSelectedMove.getPoweredUp();
            PlayerSelectedMove = AISelectedMove;
            PlayerSelectedMove.changePower(poweredUp);
        }
        if(AISelectedMove.getDoesEnemyMove()){
            double poweredUp = AISelectedMove.getPoweredUp();
            AISelectedMove = PlayerSelectedMove;
            AISelectedMove.changePower(poweredUp);
        }
        PlayerSelectedMove.changePP(AIPoke);
        if(this.PlayerSelectedMove.showName().equals("Copycat")){
            this.PlayerSelectedMove = this.AIForcedMove;
        }
        Scanner scan = new Scanner(System.in);
        if (this.isFirst || PlayerSelectedMove.showName().equals("Quash")) {
            System.out.println("You First!");
            if(PlayerSelectedMove.showaffectsBoth()) {
                System.out.println("This move can target yourself or the enemy. Who would you like to target? (E for enemy)");
                String target = scan.nextLine();
                if (target.equals("e")) {
                    Turn(PlayerPoke, PlayerPoke, PlayerSelectedMove);
                }
                if (!target.equals("e")) {
                    Turn(PlayerPoke, AIPoke, PlayerSelectedMove);
                }
            }
            if(!PlayerSelectedMove.showaffectsBoth()){
                Turn(PlayerPoke, AIPoke, PlayerSelectedMove);
            }
            if (AIPoke.showHP() > 0) {
                System.out.println("Enemy " + AIPoke.showName() + " uses " + AISelectedMove.showName());
                double target = Math.random();
                if(AISelectedMove.showaffectsBoth()) {
                    if(target > .5){
                        System.out.println("Uses on itself!");
                        Turn(AIPoke, AIPoke, AISelectedMove);
                    }
                    if (target <= .5) {
                        System.out.println("Uses on you!");
                        Turn(AIPoke, PlayerPoke, AISelectedMove);
                    }
                }
                if(!AISelectedMove.showaffectsBoth()){
                    Turn(AIPoke, PlayerPoke, AISelectedMove);
                }
                if(this.PlayerPoke.showHP() > 0) {
                    if (this.PlayerPoke.showAbility().showHealWeather()
                    || this.PlayerPoke.showAbility().getHealOnType()){
                        int Healing = PlayerPoke.showAbility().Heal(this.weather.showName(),
                                this.PlayerPoke.showSavedHP(), AISelectedMove);
                        if (!(Healing == 1)) {
                            System.out.println("Your " + this.PlayerPoke.showName() + " healed for " + Healing + " because of its " + this.PlayerPoke.showAbility().showName());
                            this.PlayerPoke.changeHP(-1 * Healing);
                        }
                    }
                    if (this.AIPoke.showAbility().showHealWeather()
                    || this.AIPoke.showAbility().getHealOnType()){
                        int Healing = this.AIPoke.showAbility().Heal(this.weather.showName(),
                                this.AIPoke.showSavedHP(), this.PlayerSelectedMove);
                        if (!(Healing == 1)) {
                            System.out.println("Enemy " + AIPoke.showName() + " healed for " + Healing + " because of its " + AIPoke.showAbility().showName());
                            this.AIPoke.changeHP(-1 * Healing);
                        }
                    }
                }
            }
        }
        if (!this.isFirst || AISelectedMove.showName().equals("Quash")){
            System.out.println("Enemy First!");
            System.out.println("Enemy " + AIPoke.showName() + " uses " + AISelectedMove.showName());
            double target = Math.random();
            if(AISelectedMove.showaffectsBoth()) {
                if(target > .5){
                    System.out.println("Uses on itself!");
                    Turn(AIPoke, AIPoke, AISelectedMove);
                }
                if (target <= .5) {
                    System.out.println("Uses on you!");
                    Turn(AIPoke, PlayerPoke, AISelectedMove);
                }
            }
            if (PlayerPoke.showHP() > 0) {
                if(PlayerSelectedMove.showName().equals("Sucker Punch")){
                    System.out.println("Sucker Punch cannot be used after the opponent!");
                }
                else {
                    Turn(PlayerPoke, AIPoke, PlayerSelectedMove);
                }
                if(this.AIPoke.showHP() > 0){
                    int Healing = 0;
                    if(this.PlayerPoke.showAbility().showHealWeather()
                    || this.PlayerPoke.showAbility().getHealOnType()) {
                        Healing = this.PlayerPoke.showAbility().Heal(this.weather.showName(),
                                this.PlayerPoke.showSavedHP(), AISelectedMove);
                        if (!(Healing == 1)) {
                            System.out.println("Your " + PlayerPoke.showName() + " healed for " + Healing + " because of its " + PlayerPoke.showAbility().showName());
                            PlayerPoke.changeHP(-1 * Healing);
                        }
                    }
                    if (this.AIPoke.showAbility().showHealWeather()){
                        Healing = this.AIPoke.showAbility().Heal(this.weather.showName(),
                                this.AIPoke.showSavedHP(), this.PlayerSelectedMove);
                        if (!(Healing == 1)) {
                            System.out.println("Enemy " + this.AIPoke.showName() + " healed for " + Healing + " because of its " + AIPoke.showAbility().showName());
                            this.AIPoke.changeHP(-1 * Healing);
                        }
                    }
                }
            }
        }
    }

    private Boolean throwBall(int ticker){
        Scanner scan = new Scanner(System.in);
        System.out.println("You have: ");
        int Balls = 0;
        List<String> options = new ArrayList<>();
        while (Balls <= 21) {
            if (ballInventory.showballAm().get(Balls) > 0) {
                System.out.println(ballInventory.showballTypes().get(Balls) + ": " + ballInventory.showballAm().get(Balls) + " [" + ballInventory.showballNum().get(Balls) + "]");
                options.add(ballInventory.showballNum().get(Balls));
            }
            Balls += 1;
        }
        String throwBall = scan.nextLine();
        while(!options.contains(throwBall)){
            System.out.println("You do not have that ball!");
            throwBall = scan.nextLine();
        }
        int thrown = Integer.valueOf(throwBall);
        String ballName = ballInventory.showballTypes().get(thrown);
        System.out.println("Throwing out a " + ballName);
        ballInventory.takeoutBall(thrown);
        Boolean Capture = AddNewPokeToTeam.addToParty(AIPoke, ballName, ticker, globalVariables, PlayerPoke);
        if(Capture){
            victoryReset();
            return true;
        }
        System.out.println("Oh no! The " + AIPoke.showName() + " escaped!");
        return false;
    }

    private Pokemon ThrowNew(){
        this.PlayerPoke.resetForThrow();
        for(Pokemon pokemon : this.Waiting){
            if(pokemon.showName().equals(
                    this.PlayerPoke.showName())){
                int index = this.CurrentParty.indexOf(pokemon);
                this.CurrentParty.set(index, this.PlayerPoke);
            }
        }
        this.affectsGround.playerPokeGroundOnSwitch(this.PlayerPoke,
                this.AIPoke);
        return ThrowPoke();
    }

    private void victoryReset() {
        int x = 0;
        for (Pokemon pokemon : Graveyard) {
            pokemon.resetForWin();
            try {
                CurrentParty.set(x, pokemon);
                x += 1;
            } catch (Exception e) {
                CurrentParty.add(x, pokemon);
                x += 1;
            }
        }
        for (Pokemon pokemon : Waiting) {
            pokemon.resetForWin();
            try {
                CurrentParty.set(x, pokemon);
                x += 1;
            } catch (Exception e) {
                CurrentParty.add(x, pokemon);
                x += 1;
            }
        }
    }
    private Boolean Flee(int Attempts){
        if(this.PlayerPoke.showAbility().showAlwaysFlee()){
            return true;
        }
        if(this.PlayerPoke.getCannotFlee()){
            return false;
        }
        double escape = (((this.PlayerPoke.showSpeed(1)) * 128.0)/AIPoke.showSpeed(1)) + 30 * Attempts;
        int odds = (int) (Math.random() * 256);
        if(odds < escape){
            return true;
        }
        if(odds>= escape){
            return false;
        }
        return null;
    }

    public Boolean CompleteFight() {
        int fleeAttempts = 0;
        System.out.println(type + " Battle Begins!");
        int ticker = 0;
        this.PlayerPoke = ThrowPoke();
        this.AIPoke = this.AIParty.get(0);
        this.globalVariables.addBattleCount(this.AIPoke.showID());
        this.AIPoke.setJustThrown();
        this.PlayerPoke.showAbility().resolveStart(this.PlayerPoke, this.AIPoke, this.weather);
        this.AIPoke.showAbility().resolveStart(this.AIPoke, this.PlayerPoke, this.weather);
        System.out.println("");
        if(this.type.equals("Trainer")) {
            System.out.println("Enemy throws out " + this.AIPoke.showName());
        }
        if(this.type.equals("Wild")) {
            System.out.println("A Wild " + this.AIPoke.showName() + " appeared!");
        }
       this.ExpLineUp.add(this.PlayerPoke);
        while ((!this.Waiting.isEmpty()) && (!this.AIParty.isEmpty())) {
            while ((this.PlayerPoke.showHP() > 0) && (this.AIPoke.showHP() > 0)) {
                ticker += 1;
                System.out.println("");
                System.out.println("Round Number: " + ticker);
                System.out.println("Enemy " + AIPoke.showName() + " is at " + AIPoke.showHP() + " HP!");
                System.out.println("Your " + PlayerPoke.showName() + " is at " + PlayerPoke.showHP() + " HP!");
                terrainTicker -= 1;
                Moves AISelectedMove = AISelectMoves();
                AISelectedMove.changePP(PlayerPoke);
                if(AISelectedMove.showName().equals("Copycat")){
                    AISelectedMove = this.playerForcedMove;
                }
                String choice = "";
                if(playerChargeTimer <= 0) {
                    choice = selectAction();
                    if (choice.equals("1")) {
                        useMove(AISelectedMove, choice);
                    }
                    if (choice.equals("2")) {
                        System.out.println("Not currently funtioning!");
                    }
                    if (choice.equals("3")) {
                        System.out.println("Switching Pokemon!");
                        this.PlayerPoke = ThrowNew();
                        this.ExpLineUp.add(this.PlayerPoke);
                    }
                    if (choice.equals("4")) {
                        Boolean capture = throwBall(ticker);
                        if (capture) {
                            return true;
                        }
                    }
                    if (choice.equals("5")) {
                        fleeAttempts += 1;
                        Boolean escape = Flee(fleeAttempts);
                        if (escape) {
                            return true;
                        }
                    }
                    if(choice.equals("6")){
                        useMove(AISelectedMove, choice);
                    }
                }
                if(playerChargeTimer > 0){
                    System.out.println("Your " + PlayerPoke.showName() + " is charging!");
                }
                if(this.AIPoke.showHP() > 0){
                    endTurn(this.AIPoke, this.PlayerPoke);
                }
                if(this.PlayerPoke.showHP() > 0) {
                    endTurn(this.PlayerPoke, this.AIPoke);
                    if (!choice.equals("1")) {
                        if (!AISelectedMove.showreqCharge()) {
                            nonuseMove(AISelectedMove);
                        }
                        if (AISelectedMove.showreqCharge()) {
                            System.out.println("Enemy " + this.AIPoke.showName() + " is charging!");
                        }
                    }
                }
                this.isTrickRoom -= 1;
            }
            if (this.PlayerPoke.showHP() <= 0) {
                this.AIPoke.showAbility().addStageOnDeath(this.AIPoke);
                this.Waiting.remove(this.PlayerPoke);
                this.Graveyard.add(this.PlayerPoke);
                if (!this.Waiting.isEmpty()) {
                    this.PlayerPoke = ThrowPoke();
                }
                this.ExpLineUp.remove(this.PlayerPoke);
            }
            if (this.AIPoke.showHP() <= 0) {
                this.PlayerPoke.showAbility().addStageOnDeath(this.PlayerPoke);
                this.AIParty.remove(this.AIPoke);
                for (Pokemon pokemon : this.ExpLineUp){
                    pokemon.addEVs(this.PlayerPoke, this.AIPoke);
                    System.out.println("");
                    Boolean EvolTime = this.Waiting.get(this.Waiting.indexOf(pokemon)).LevelUp(type, AIPoke);
                    if(EvolTime) {
                        Scanner scan = new Scanner(System.in);
                        System.out.println(pokemon.showName() + " can evolve. Do you accept?");
                        String Ev = scan.nextLine();
                        if (Ev.equals("y")) {
                            this.PlayerPoke = evolvePoke(this.globalVariables, this.PlayerPoke);
                            this.Waiting.remove(pokemon);
                            this.Waiting.add(this.PlayerPoke);
                            System.out.println(pokemon.showName() + " has evolved!");
                        }
                    }
                }
                if (!AIParty.isEmpty()) {
                    AIPoke = AIParty.get(0);
                    globalVariables.addBattleCount(AIPoke.showID());
                    System.out.println("Enemy has thrown out " + AIPoke.showName());
                }
            }
        }
        if (Waiting.isEmpty()) {
            int x = 0;
            for (Pokemon pokemon : Graveyard) {
                pokemon.resetForWin();
                try {
                    CurrentParty.set(x, pokemon);
                    x += 1;
                } catch (Exception e) {
                    CurrentParty.add(x, pokemon);
                    x += 1;
                }
            }
            return false;
        }
        if (AIParty.isEmpty()) {
            victoryReset();
            return true;
        }
        return false;
    }

    private void Turn(Pokemon attacker, Pokemon defender, Moves SelectMove) {
        Boolean magicRoom = magicRoomTimer > 0;
        this.magicRoomTimer -= 1;
        Moves enemyMove = this.PlayerSelectedMove;
        if(attacker == this.PlayerPoke){
            enemyMove = this.AISelectedMove;
        }
        if(SelectMove.Hits(attacker, defender, this.PlayerPoke, this.weather)){
            int DamageDealt = 0;
            Boolean Paralyzed = false;
            Boolean Infatuated = false;
            String newMove = "";
            if((!defender.showAbility().getIgnoresMove()) ||
                    (defender.showAbility().getIgnoresMove() &&
                            defender.showAbility().getIgnoresMovesNames().contains(SelectMove.showName()))) {
                if (SelectMove.showName().equals("Sleep Talk") && attacker.showAsleep()) {
                    attacker.Wake();
                    newMove = "Sleep Talk";
                    int newSelection = (int) Math.round(Math.random() * attacker.showMoves().size());
                    SelectMove = attacker.showMoves().get(newSelection);
                }
                if (SelectMove.showName().equals("Secret Power")) {
                    SelectMove.setSecretPowerStats(this.areaType);
                }
                if (attacker.showParalysis()) {
                    int ParalysisChance = (int) (Math.random() * 4);
                    if (ParalysisChance <= 1) {
                        Paralyzed = true;
                    }
                }
                if (attacker.showIsInfatuated()) {
                    if (Math.random() <= .5) {
                        Infatuated = true;
                    }
                }
                if (!attacker.showFlinched()) {
                    if (attacker == PlayerPoke) {
                        playerForcedMove = SelectMove;
                    }
                    if (attacker == AIPoke) {
                        AIForcedMove = SelectMove;
                    }
                    if (!attacker.showFrozen() && !attacker.showAsleep()
                            && !Paralyzed && !Infatuated &&
                            attacker.showIsConfused()) {
                        if (Math.random() <= .33) {
                            SelectMove = new ConfusionDamage();
                            DamageDealt = SelectMove.damageDealt(
                                    attacker, attacker, this.weather,
                                    this.PlayerPoke, this.terrain,
                                    this.Waiting, enemyMove, this.isFirst,
                                    magicRoom);
                            attacker.changeHP(DamageDealt);
                            System.out.println(getAttackerName(attacker) +
                                    " dealt " + DamageDealt +
                                    " damage to itself because of confusion!");
                        }
                    }
                    if (!attacker.showFrozen() && !attacker.showAsleep()
                            && !Paralyzed && !Infatuated &&
                            !SelectMove.showName().equals(
                                    "Confusion Damage") &&
                            !defender.showChargeProtect() &&
                            !SelectMove.showHealOrDamage()) {
                        if ((SelectMove.showreqCharge()) &&
                                (attacker == PlayerPoke)) {
                            playerChargeTimer = SelectMove.getTurnLength();
                            System.out.println("Your " + attacker.showName() + " must charge for " + playerChargeTimer);
                            if (SelectMove.showCannotBeAttacked()) {
                                attacker.setChargeProtect();
                            }
                        }
                        if ((SelectMove.showreqCharge()) && (attacker == AIPoke)) {
                            AIChargeTimer = SelectMove.getTurnLength();
                            System.out.println("Enemy " + attacker.showName() + " must charge for " + AIChargeTimer);
                            if (SelectMove.showCannotBeAttacked()) {
                                attacker.setChargeProtect();
                            }
                        }
                        if (SelectMove.showSelfKnockOffItem()) {
                            attacker.giveItem(new NoItem());
                        }
                        if (!SelectMove.showName().equals("Snore")) {
                            if (attacker == this.PlayerPoke) {
                                if (attacker.showChargeProtect()) {
                                    attacker.unChargeProtect();
                                }
                                if ((SelectMove.dealsDamage) &&
                                        (playerChargeTimer <= 0)) {
                                    DamageDealt = SelectMove.damageDealt(
                                            attacker, attacker, this.weather,
                                            this.PlayerPoke, this.terrain,
                                            this.Waiting, enemyMove, this.isFirst,
                                            magicRoom);
                                    if (!SelectMove.getDealsFutureDamage()) {
                                        System.out.println("Your " +
                                                this.PlayerPoke.showName() + " dealt " +
                                                DamageDealt + " damage!");
                                        if (defender.showSubstituteHP() <= 0 || SelectMove.showIgnoreSubstitute()) {
                                            defender.changeHP(DamageDealt);
                                            defender.setPreviousDamage(DamageDealt);
                                            if(this.AIPoke.getBideDamage() > 0 || enemyMove.showName().equals("Bide")){
                                                this.AIPoke.setBideDamage(DamageDealt);
                                            }
                                        }
                                        if (defender.showSubstituteHP() > 0 && !SelectMove.showIgnoreSubstitute()) {
                                            defender.damageSubstitute(DamageDealt);
                                            if (defender.showSubstituteHP() <= 0) {
                                                System.out.println("Enemy " + defender.showName() + " decoy broke!");
                                            }
                                        }
                                        if(DamageDealt == 0 && SelectMove.showName().equals("High Jump Kick")){
                                            attacker.changeHP((int) (.5 * attacker.showSavedHP()));
                                        }
                                        if (SelectMove.showName().equals("False Swipe") || defender.showEndures()) {
                                            if (defender.showHP() <= 0) {
                                                defender.setHP(1);
                                            }
                                        }
                                        if (SelectMove.showDamBackHeal()) {
                                            int Heal = (int) Math.round(DamageDealt / SelectMove.showBackHealAm());
                                            System.out.println("Your " + this.PlayerPoke.showName() + " healed for " + DamageDealt + " !");
                                            attacker.changeHP(-1 * Heal);
                                        }
                                    } else {
                                        if (attacker == this.PlayerPoke) {
                                            this.playerFutureDamage = DamageDealt;
                                            this.playerFutureDamageTimer = SelectMove.getTimeToFutureDamage();
                                        } else {
                                            this.AIFutureDamage = DamageDealt;
                                            this.AiFutureDamageTimer = SelectMove.getTimeToFutureDamage();
                                        }
                                    }
                                }
                            }
                        }
                        if (attacker == this.AIPoke) {
                            if (attacker.showChargeProtect()) {
                                attacker.unChargeProtect();
                            }
                            if ((SelectMove.dealsDamage) && (this.AIChargeTimer <= 0)) {
                                if (!SelectMove.getRequiresSleep() || defender.showAsleep()) {
                                    DamageDealt = SelectMove.damageDealt(
                                            attacker, attacker, this.weather,
                                            this.PlayerPoke, this.terrain,
                                            this.Waiting, enemyMove, this.isFirst,
                                            magicRoom);
                                    System.out.println("Enemy " + this.AIPoke.showName() +
                                            " dealt " + DamageDealt + " damage!");
                                    if (defender.showSubstituteHP() <= 0 ||
                                            SelectMove.showIgnoreSubstitute()) {
                                        defender.changeHP(DamageDealt);
                                        defender.damageSubstitute(DamageDealt);
                                    }
                                    if (defender.showSubstituteHP() > 0 && !SelectMove.showIgnoreSubstitute()) {
                                        defender.damageSubstitute(DamageDealt);
                                        if (defender.showSubstituteHP() <= 0) {
                                            System.out.println("Enemy " + defender.showName() + " decoy broke!");
                                        }
                                    }
                                    if (SelectMove.showName().equals("False Swipe") || defender.showEndures()) {
                                        if (defender.showHP() <= 0) {
                                            defender.setHP(1);
                                        }
                                    }
                                    if (SelectMove.showDamBackHeal()) {
                                        int Heal = (int) Math.round(DamageDealt / SelectMove.showBackHealAm());
                                        System.out.println("Enemy " + AIPoke.showName() + " healed for " + DamageDealt + " !");
                                        attacker.changeHP(-1 * Heal);
                                    }
                                }
                            }
                            if ((SelectMove.dealsDamage) && (this.AIChargeTimer > 0)) {
                                System.out.println("Enemy " + attacker.showName() + " must charge!");
                            }
                        }
                        if (SelectMove.showName().equals("Snore")) {
                            System.out.println("Snore only works when the user is asleep!");
                        }
                            if(DamageDealt <= 0 || !defender.showAbility().showNoSecondary()){
                            if (SelectMove.showEnemyKnockOffItem()) {
                                if(SelectMove.showName().equals("Incinerate") &&
                                defender.showItem().getIsBerry()){
                                    defender.giveItem(new NoItem());
                                }
                                else {
                                    defender.giveItem(new NoItem());
                                }
                            }
                            if(SelectMove.getResetsType()){
                                if(SelectMove.StateChangeAlly) {
                                    if (SelectMove.getResetsTypeFrom().equals(attacker.showType1())) {
                                        attacker.setType3(SelectMove.getResetsTypeTo());
                                    }
                                    if (SelectMove.getResetsTypeFrom().equals(attacker.showType2())) {
                                        attacker.setType4(SelectMove.getResetsTypeTo());
                                    }
                                    if(SelectMove.getResetsTypeFrom().equals("Both")){
                                        attacker.setType3(SelectMove.getResetsTypeTo());
                                        attacker.setType4("");
                                    }
                                }
                                if(SelectMove.StatchangeEnemy) {
                                    if (SelectMove.getResetsTypeFrom().equals(defender.showType1())) {
                                        defender.setType3(SelectMove.getResetsTypeTo());
                                    }
                                    if (SelectMove.getResetsTypeFrom().equals(defender.showType2())) {
                                        defender.setType4(SelectMove.getResetsTypeTo());
                                    }
                                }
                            }
                            if (SelectMove.showTakeItem()) {
                                if (!attacker.showItem().showName().equals("") && !defender.showItem().showName().equals("")) {
                                    attacker.giveItem(defender.showItem());
                                    defender.giveItem(new NoItem());
                                }
                            }
                            if (SelectMove.getCreatesPhysWall()) {
                                attacker.setHasPhysWall(SelectMove.getPhysWallTimer());
                                System.out.println(attacker.showName() + " has built a physical wall!");
                            }
                            if (SelectMove.getCreatesSpecWall()) {
                                attacker.setHasSpecWall(SelectMove.getSpecWallTimer());
                                System.out.println(attacker.showName() + " has built a special wall!");
                            }
                            if (SelectMove.getBreaksBarriers()) {
                                defender.breakBarriers();
                                System.out.println("Barriers Broken!");
                            }
                            if(SelectMove.getMagicRoomAdd() > 0){
                                this.magicRoomTimer += SelectMove.getMagicRoomAdd();
                            }
                            if(SelectMove.getChargesElectric()){
                                attacker.setHasElectricCharge();
                            }
                            if (SelectMove.showTerrainChange()) {
                                terrain = SelectMove.getToTerrain();
                                System.out.println("The terrain has changed to " + SelectMove.getToTerrain().showName());
                                terrainTicker = 5;
                            }
                            if (SelectMove.showHeal()) {
                                int CurrentHP = attacker.showHP();
                                SelectMove.showHealAm(weather, attacker);
                                if (attacker.showHP() > attacker.showSavedHP()) {
                                    attacker.resetHP();
                                }
                                int Healed = attacker.showHP() - CurrentHP;
                                System.out.println(getAttackerName(attacker) + " healed for " + Healed);
                            }
                            if (SelectMove.getCausesOutrage()) {
                                attacker.setOutrageTimer(SelectMove.getOutrageTimer());
                            }
                            if(SelectMove.getCausesCannotFlee()){
                                defender.setCannotFlee();
                            }
                            if(SelectMove.getCausesDisabled() > 0){
                                if(attacker == this.PlayerPoke){
                                    this.AISelectedMove.setIsDisabled(SelectMove.getCausesDisabled());
                                }
                                else {
                                    this.PlayerSelectedMove.setIsDisabled(SelectMove.getCausesDisabled());
                                }
                            }
                            if(SelectMove.getCausesEnemyOutrage()){
                                defender.setOutrageTimer(SelectMove.getEnemyOutrageTimer());
                            }
                            if (SelectMove.getCausesNoItem()) {
                                defender.setCannotUseItems();
                                defender.setTormentTimer(SelectMove.getTormentTimer());
                            }
                            if (SelectMove.showaffectsAbilities()) {
                                defender.changeAbilities(SelectMove.showtoAbility());
                            }
                            if (SelectMove.showAbilitySwap()) {
                                Abilities attackerAbility = attacker.showAbility();
                                attacker.changeAbilities(defender.showAbility());
                                defender.changeAbilities(attackerAbility);
                            }
                            if(SelectMove.getGiveEnemyAbility()){
                                defender.changeAbilities(attacker.showAbility());
                            }
                            if (SelectMove.getCreatesImprison()) {
                                defender.setIsImprisoned();
                            }
                            if(SelectMove.showName().equals("Stockpile")){
                                attacker.addToStockpile();
                            }
                            if(SelectMove.getProtectsFromStatChanges() > 0){
                                attacker.setCannotHaveStatLowered(SelectMove.getProtectsFromStatChanges());
                            }
                            if(SelectMove.getCausesNoMiss()){
                                attacker.setCannotMiss();
                            }
                            if (SelectMove.showStatChange()) {
                                Boolean Succeeds = true;
                                if (SelectMove.showcanMiss()) {
                                    Succeeds = SelectMove.Hits(attacker, defender, this.PlayerPoke, this.weather);
                                }
                                if (SelectMove.showStatChangeReqChance()) {
                                    if (((SelectMove.showStatChangeReq() / 100) < Math.random())) {
                                        Succeeds = false;
                                    }
                                }
                                if (Succeeds) {
                                    if (SelectMove.showStatChangeEnemy()) {
                                        if (defender.showSubstituteHP() <= 0 || SelectMove.showIgnoreSubstitute()) {
                                            if ((SelectMove.showAffectsEnemy()) && (!defender.getNoStatChange())) {
                                                SelectMove.StatChange(attacker, defender, this.PlayerPoke, this.weather);
                                            }
                                            if ((SelectMove.showAffectsEnemy()) && (defender.getNoStatChange())) {
                                                System.out.println(getAttackerName(attacker) + " cannot have their stats changed!");
                                            }
                                        }
                                    }
                                    if (SelectMove.showStatChangeAlly()) {
                                        if ((SelectMove.getNeedsKnockOut() && defender.showHP() <= 0) || !SelectMove.getNeedsKnockOut()) {
                                            SelectMove.StatChange(attacker, defender, this.PlayerPoke, this.weather);
                                        }
                                    }
                                }
                            }
                            if (SelectMove.showSelfDamage()) {
                                int damage = SelectMove.selfDamage(DamageDealt);
                                attacker.addToRecoilTotal(damage);
                                attacker.changeHP(damage);
                            }
                            if(SelectMove.getFutureFallAsleep()){
                                defender.setFallAsleep(SelectMove.getFutureFallAsleepTimer());
                            }
                            if (SelectMove.showcanSeed()) {
                                if (defender.showSubstituteHP() <= 0 || SelectMove.showIgnoreSubstitute()) {
                                    if (SelectMove.showcanMiss()) {
                                        if (SelectMove.Hits(attacker, defender, this.PlayerPoke, this.weather)) {
                                            defender.Seed();
                                        }
                                    }
                                    if (!SelectMove.showcanMiss()) {
                                        defender.Seed();
                                    }
                                    if ((defender.showType1().equals("Grass")) || ((defender.showType2()).equals("Grass"))) {
                                        defender.resetSeed();
                                        System.out.println("Leech Seed doesn't affect Grass Types!");
                                    }
                                }
                            }
                            if(this.terrain.showName().equals("Misty")) {
                                if (SelectMove.showCanConfuse() || SelectMove.showCanOnlyConfuse()) {
                                    if (defender.showSubstituteHP() <= 0 || SelectMove.showIgnoreSubstitute()) {
                                        if (SelectMove.showCanOnlyConfuse()) {
                                            if (SelectMove.showcanMiss()) {
                                                if (SelectMove.Hits(attacker, defender, this.PlayerPoke, this.weather)) {
                                                    defender.Confuse(attacker);
                                                }
                                            }
                                            if (!SelectMove.showcanMiss()) {
                                                defender.Confuse(attacker);
                                            }
                                        }
                                        if (SelectMove.showCanConfuse()) {
                                            if ((SelectMove.showConfuseChance()) >= Math.random()) {
                                                defender.Confuse(attacker);
                                            }
                                        }
                                        if (defender.showIsConfused()) {
                                            System.out.println(getAttackerName(attacker) + " has been confused!");
                                        }
                                    }
                                }
                                if (SelectMove.showcanPoison() || SelectMove.showOnlyCanPoison()) {
                                    if (defender.showSubstituteHP() <= 0 || SelectMove.showIgnoreSubstitute()) {
                                        if (SelectMove.showOnlyCanPoison()) {
                                            if (SelectMove.showcanMiss()) {
                                                if (SelectMove.Hits(attacker, defender, this.PlayerPoke, this.weather)) {
                                                    defender.Poison();
                                                }
                                            }
                                            if (!SelectMove.showcanMiss()) {
                                                defender.Poison();
                                            }
                                        }
                                    if (SelectMove.showcanPoison()) {
                                            if ((SelectMove.showPoisonChance()) >= Math.random()) {
                                                defender.Poison();
                                            }
                                        }
                                        if ((defender.showType1().equals("Poison")) || ((defender.showType2()).equals("Poison"))) {
                                            defender.unPoison();
                                            System.out.println("Poison doesn't affect Poison Types!");
                                        }
                                        if ((defender.showType1().equals("Steel")) || ((defender.showType2()).equals("Steel"))) {
                                            defender.unPoison();
                                            System.out.println("Poison doesn't affect Steel Types!");
                                        }
                                        if (defender.showAbility().showPoison()) {
                                            System.out.println(defender.showName() + " cannot be poisoned because of its " + defender.showAbility().showName());
                                        }
                                        if (defender.showPoisoned()) {
                                            System.out.println(getAttackerName(defender) + " has been poisoned!");
                                        }
                                    }
                                }
                                if (SelectMove.showcanSleep() || SelectMove.showOnlyCanSleep()) {
                                    if (defender.showSubstituteHP() <= 0 || SelectMove.showIgnoreSubstitute()) {
                                        this.sleepTimer = (int) (Math.random() * 4);
                                        if (defender.showAbility().getCutSleep()) {
                                            this.sleepTimer = this.sleepTimer / defender.showAbility().getCutSleepBy();
                                        }
                                        if (SelectMove.showOnlyCanSleep()) {
                                            if (SelectMove.showcanMiss()) {
                                                if (SelectMove.Hits(attacker, defender, this.PlayerPoke, this.weather)) {
                                                    defender.Sleep();
                                                }
                                            }
                                            if (!SelectMove.showcanMiss()) {
                                                defender.Sleep();
                                            }
                                        }
                                        if (SelectMove.showcanSleep()) {
                                            if ((SelectMove.showSleepChance()) >= Math.random()) {
                                                defender.Sleep();
                                            }
                                        }
                                        if (defender.showAbility().showSleep()) {
                                            System.out.println(defender.showName() + " cannot be put to sleep because of its " + defender.showAbility().showName());
                                        }
                                        if (defender.showAsleep()) {
                                            System.out.println(getAttackerName(defender) + " has been put to sleep!");
                                        }
                                    }
                                }
                                if (SelectMove.getOnlyCanParalyze() || SelectMove.showcanParalyze()) {
                                    if (defender.showSubstituteHP() <= 0 || SelectMove.showIgnoreSubstitute()) {
                                        if (SelectMove.getOnlyCanParalyze()) {
                                            if (SelectMove.showcanMiss()) {
                                                if (SelectMove.Hits(attacker, defender, this.PlayerPoke, this.weather)) {
                                                    defender.Paralyze();
                                                }
                                            }
                                            if (!SelectMove.showcanMiss()) {
                                                defender.Paralyze();
                                            }
                                        }
                                        if (SelectMove.showcanParalyze()) {
                                            if (SelectMove.getParalysisTypeFail().equals(defender.showType1()) || SelectMove.getParalysisTypeFail().equals(defender.showType2())) {
                                                System.out.println(SelectMove.showName() + " cannot paralyze " + SelectMove.getParalysisTypeFail() + " types!");
                                            }
                                            if (!SelectMove.getParalysisTypeFail().equals(defender.showType1()) && !SelectMove.getParalysisTypeFail().equals(defender.showType2())) {
                                                if ((SelectMove.getParalysisChance()) >= (Math.random())) {
                                                    defender.Paralyze();
                                                }
                                            }
                                        }
                                        if (defender.showType1().equals("Ground") || defender.showType2().equals("Ground")) {
                                            if (SelectMove.showType().equals("Electric")) {
                                                defender.unParalyze();
                                                System.out.println("Ground types cannot be paralyzed by electric moves!");
                                            }
                                        }
                                        if (defender.showAbility().showParalyze()) {
                                            System.out.println(defender.showName() + " cannot be paralyzed because of its " + defender.showAbility().showName());
                                        }
                                        if (defender.showParalysis()) {
                                            System.out.println(getAttackerName(defender) + " has been paralyzed!");
                                        }
                                    }
                                }
                            }
                            if (SelectMove.showName().equals("Psycho Shift")) {
                                if (attacker.showBurn()) {
                                    defender.Burn();
                                }
                                if (attacker.showPoisoned()) {
                                    defender.Poison();
                                }
                                if (attacker.showParalysis()) {
                                    defender.Paralyze();
                                }
                                if (attacker.showAsleep()) {
                                    defender.Sleep();
                                }
                                if (attacker.showFrozen()) {
                                    defender.Freeze();
                                }
                            }
                            if(SelectMove.getSwapPower()){
                                SelectMove.swapPowers(attacker, defender);
                            }
                            if (SelectMove.showcanFreeze() || SelectMove.showOnlyCanSleep()) {
                                if (defender.showSubstituteHP() <= 0 || SelectMove.showIgnoreSubstitute()) {
                                    if (SelectMove.showOnlyCanFreeze()) {
                                        if (SelectMove.showcanMiss()) {
                                            if (SelectMove.Hits(attacker, defender, this.PlayerPoke, this.weather)) {
                                                defender.Freeze();
                                            }
                                        }
                                        if (!SelectMove.showcanMiss()) {
                                            defender.Freeze();
                                        }
                                    }
                                    if (SelectMove.showcanFreeze()) {
                                        if ((SelectMove.getFreezeChance()) >= Math.random()) {
                                            defender.Freeze();
                                        }
                                    }
                                    if ((defender.showType1().equals("Ice")) || ((defender.showType2()).equals("Ice"))) {
                                        defender.unPoison();
                                        System.out.println("Freeze doesn't affect Ice Types!");
                                    }
                                    if (defender.showAbility().showFreeze()) {
                                        System.out.println(defender.showName() + " cannot be frozen because of its " + defender.showAbility().showName());
                                    }
                                    if (defender.showFrozen()) {
                                        System.out.println(getAttackerName(defender) + " has been frozen!");
                                    }
                                }
                            }
                            if (SelectMove.showcanBurn() || SelectMove.showOnlyCanBurn()) {
                                if (defender.showSubstituteHP() <= 0 || SelectMove.showIgnoreSubstitute()) {
                                    if (SelectMove.showOnlyCanBurn()) {
                                        if (SelectMove.showcanMiss()) {
                                            if (SelectMove.Hits(attacker, defender, PlayerPoke, weather)) {
                                                defender.Burn();
                                            }
                                        }
                                        if (!SelectMove.showcanMiss()) {
                                            defender.Burn();
                                        }
                                    }
                                  if (SelectMove.showcanBurn()) {
                                        if ((SelectMove.showBurnChance() / 100) >= Math.random()) {
                                            defender.Burn();
                                        }
                                    }
                                    if (defender.showType1().equals("Fire")) {
                                        defender.unPoison();
                                        System.out.println("Burn doesn't affect Fire Types!");
                                    }
                                    if (defender.showAbility().showBurn()) {
                                        System.out.println(defender.showName() + " cannot be burned because of its " + defender.showAbility().showName());
                                    }
                                    if (defender.showBurn()) {
                                        System.out.println(getAttackerName(defender) + " has been burned!");
                                    }
                                }
                            }
                            if (SelectMove.getAffectsStatChange()) {
                                attacker.setNoStatChange();
                                attacker.setStatChangeTimer(SelectMove.showTimerChange());
                                System.out.println(getAttackerName(defender) + " cannot be affected by status changes!");
                            }
                            if (SelectMove.showUsesBerry()) {
                                attacker.showItem().useBerry(attacker, magicRoom);
                                if (attacker == PlayerPoke) {
                                    playerItemUsed = attacker.showItem();
                                } else {
                                    AIItemUsed = attacker.showItem();
                                }
                            }
                            if(SelectMove.showName().equals("Quick Guard")){
                                attacker.setHasQuickGaurd();
                            }
                            if (SelectMove.getUsesSpentItem()) {
                                if (attacker == PlayerPoke) {
                                    if (playerItemUsed != null) {
                                        System.out.println("WRITE CODE TO USE ITEM");
                                    }
                                }
                                if (attacker == AIPoke) {
                                    if (AIItemUsed != null) {
                                        System.out.println("WRITE CODE TO USE ITEM");
                                    }
                                }
                            }
                            if (SelectMove.showEndsVortex()) {
                                attacker.showVortex().endVortex(attacker);
                                attacker.resetSeed();
                            }
                            if (SelectMove.showEnemyResetStats()) {
                                defender.resetMults();
                            }
                            if (SelectMove.showAllyResetStats()) {
                                attacker.resetMults();
                            }
                            if (SelectMove.showCreatesVortex()) {
                                if (!SelectMove.showVortexSelf()) {
                                    defender.setVortex(SelectMove.showVortex());
                                    defender.showVortex().setCannotLeave(defender);
                                    defender.setVortex();
                                    if (defender.showVortex().showCannotLeave()) {
                                        defender.setVortexMove();
                                    }
                                    if (defender.showVortex().getVortexAcc()) {
                                        defender.changeAccMult(-1);
                                    }
                                    if (defender.showVortex().getVortexEv()) {
                                        defender.changeEvasMult(-1);
                                    }
                                    if (defender.showVortex().getVortexSpeed()) {
                                        defender.changeSpeedMult(-1);
                                    }
                                    if (defender.showVortex().getVortexPhysDef()) {
                                        defender.changeDefMult(-1);
                                    }
                                    if (defender.showVortex().getVortexPhysAtt()) {
                                        defender.changeAttMult(-1);
                                    }
                                    if (defender.showVortex().getVortexSpecAtt()) {
                                        defender.changeSpecAttMult(-1);
                                    }
                                    if (defender.showVortex().getVortexSpecDef()) {
                                        defender.changeSpecDefMult(-1);
                                    }
                                }
                                if (SelectMove.showVortexSelf()) {
                                    attacker.setVortex(SelectMove.showVortex());
                                    attacker.showVortex().setCannotLeave(defender);
                                    attacker.setVortex();
                                    if (attacker.showVortex().showCannotLeave()) {
                                        attacker.setVortexMove();
                                    }
                                    if (attacker.showVortex().getVortexAcc()) {
                                        attacker.changeAccMult(-1);
                                    }
                                    if (attacker.showVortex().getVortexEv()) {
                                        attacker.changeEvasMult(-1);
                                    }
                                    if (attacker.showVortex().getVortexSpeed()) {
                                        attacker.changeSpeedMult(-1);
                                    }
                                    if (attacker.showVortex().getVortexPhysDef()) {
                                        attacker.changeDefMult(-1);
                                    }
                                    if (attacker.showVortex().getVortexPhysAtt()) {
                                        attacker.changeAttMult(-1);
                                    }
                                    if (attacker.showVortex().getVortexSpecAtt()) {
                                        attacker.changeSpecAttMult(-1);
                                    }
                                    if (attacker.showVortex().getVortexSpecDef()) {
                                        attacker.changeSpecDefMult(-1);
                                    }
                                }
                            }
                            if (SelectMove.showFullRestore()) {
                                attacker.ridStatusEffects();
                                attacker.resetHP();
                                System.out.println(getAttackerName(attacker) + " has fully been restored!");
                            }
                            if(SelectMove.getRidsStatusEffects()){
                                attacker.ridStatusEffects();
                            }
                            if (SelectMove.showSelfSleep()) {
                                attacker.Sleep();
                                System.out.println(getAttackerName(attacker) + " has put itself to sleep!");
                            }
                            if (SelectMove.showFullDef()) {
                                attacker.gainProtection();
                                System.out.println(getAttackerName(attacker) + " has protected itself from attack!");
                            }
                            if (SelectMove.showCharge()) {
                                attacker.Charge();
                                System.out.println(getAttackerName(attacker) + " has charged its next attack!");
                            }
                            if (SelectMove.showCanInfatuate()) {
                                if (defender.showSubstituteHP() <= 0 || SelectMove.showIgnoreSubstitute()) {
                                    if (attacker.showhasGender() && defender.showhasGender()) {
                                        if (attacker.showGender().equals(defender.showGender())) {
                                            defender.Infatuate();
                                            System.out.println(getAttackerName(attacker) + " has infatuated the enemy!");
                                        }
                                        if (!attacker.showGender().equals(defender.showGender())) {
                                            System.out.println("Infatuation only works on different genders!");
                                        }
                                    }
                                    if (!attacker.showhasGender() || !defender.showhasGender()) {
                                        System.out.println("Both pokemon must have a gender!");
                                    }
                                }
                            }
                            if(!SelectMove.getProhibitsMoves().isEmpty()){
                                defender.setProhibitedMoves(SelectMove.getProhibitsMoves());
                            }
                            if (SelectMove.showWeatherChange()) {
                                this.weather = SelectMove.showToWeather();
                                System.out.println("The weather is now " + this.weather.showName());
                                this.weatherTicker = 5;
                            }
                            if (SelectMove.getWebsGround()) {
                                if (attacker == this.PlayerPoke) {
                                    this.affectsGround.setStickyWebAgainstAI();
                                } else {
                                    this.affectsGround.setStickyWebAgainstPlayer();
                                }
                            }
                            if (SelectMove.getSpikesGround()) {
                                if (attacker == this.PlayerPoke) {
                                    this.affectsGround.addToAISpikeLayers();
                                } else {
                                    this.affectsGround.addToPlayerSpikeLayers();
                                }
                            }
                            if(SelectMove.getAddsToHP() > 0.0){
                                attacker.addToHealPerTurn(SelectMove.getAddsToHP());
                            }
                            if(SelectMove.getToxicSpikesGround()){
                                if (attacker == this.PlayerPoke) {
                                    this.affectsGround.setToxicSpikeAgainstAILayer();
                                } else {
                                    this.affectsGround.setGetToxicSpikeAgainstPlayerLayer();
                                }
                            }
                            if(SelectMove.showName().equals("Stealth Rock")){
                                if(attacker == this.PlayerPoke){
                                    this.affectsGround.setStealthRockAgainstAI();
                                }
                                else {
                                    this.affectsGround.setStealthRockAgainstPlayer();
                                }
                            }
                            if(SelectMove.getCausesLevitate()){
                                if (attacker == this.PlayerPoke) {
                                    this.PlayerPoke.setFakeLevitateTimer(SelectMove.getLevitateTimer());
                                } else {
                                    this.AIPoke.setFakeLevitateTimer(SelectMove.getLevitateTimer());
                                }
                            }
                            if (SelectMove.showCanFlinch() || defender.showAbility().showName().equals("Stench")) {
                                if (!defender.showAbility().getNoFlinch()) {
                                    Boolean abilityAffected = false;
                                    if (defender.showAbility().showName().equals("Stench")) {
                                        if (SelectMove.showFlinchChance() == 0) {
                                            SelectMove.setFlinchChance(10);
                                            abilityAffected = true;
                                        }
                                    }
                                    if ((SelectMove.showFlinchChance() / 100.0) >= Math.random()) {
                                        defender.Flinch();
                                        System.out.println(defender.showName() + " is flinching!");
                                        defender.showAbility().addStageDuringEffect(defender, attacker, "Flinch");
                                    }
                                    if (abilityAffected) {
                                        SelectMove.resetFlinchChance();
                                    }
                                }
                            }
                            if(SelectMove.getCreatesTrickRoom() > 0){
                                this.isTrickRoom = SelectMove.getCreatesTrickRoom();
                            }
                            if (SelectMove.showCreatesSubstitute()) {
                                attacker.createSubstitute();
                            }
                            if (SelectMove.showName().equals("Fire") && defender.showFrozen()) {
                                if (defender.showSubstituteHP() <= 0 || SelectMove.showIgnoreSubstitute()) {
                                    defender.unFreeze();
                                    System.out.println("Fire cures freeze!");
                                }
                            }
                            if (SelectMove.showEndures()) {
                                attacker.setEndures();
                            }
                            if (SelectMove.showForcesSitOut()) {
                                attacker.setForcedSitOut();
                            }
                            if (SelectMove.showSelfConfuse()) {
                                if (attacker.getOutrageTimer() <= 0) {
                                    attacker.Confuse(defender);
                                    int addToConfuse = (int) (Math.round(Math.random() * (4) + 2));
                                    attacker.setConfuseTimer(addToConfuse);
                                }
                            }
                            if (SelectMove.showOutrage()) {
                                attacker.setOutrage();
                                attacker.setOutrageTimer((int) Math.round(Math.random() * (SelectMove.showOutrageMaxTimer()
                                        - SelectMove.showOutrageMinTimer() + 1) + SelectMove.showOutrageMinTimer()));
                            }
                            if (SelectMove.getCausesTorment()) {
                                defender.setTormentTimer(SelectMove.getTormentTimer());
                                defender.setIsTormented();
                            }
                            if (SelectMove.showWhirlwindEffect() &&
                                    SelectMove.showIgnoreSubstitute()) {
                                if (defender == this.AIPoke) {
                                    if (this.type.equals("Wild")) {
                                        defender.setHP(0);
                                    }
                                    if (!this.type.equals("Wild")) {
                                        if (this.AIParty.size() > 1) {
                                            getNextAIPoke();
                                        }
                                        if (this.AIParty.size() <= 1) {
                                            System.out.println("Enemy party hs only one pokemon left!");
                                        }
                                    }
                                }
                            }
                        }
                        if (defender == this.PlayerPoke) {
                            if (this.Waiting.size() > 1) {
                                this.PlayerPoke = ThrowNew();
                                this.PlayerPoke.setThrownOnFaint();
                                this.PlayerPoke.showAbility().resolveStart(
                                        this.PlayerPoke, this.AIPoke, this.weather);
                            }
                            if (this.Waiting.size() <= 1) {
                                System.out.println("You do not have another pokemon to switch out with!");
                            }
                        }
                    }
                    if (SelectMove.showSelfWhirlwindEffect()) {
                        if (attacker == this.AIPoke) {
                            if (!this.type.equals("Wild")) {
                                if (this.AIParty.size() > 1) {
                                    getNextAIPoke();
                                }
                                if (this.AIParty.size() <= 1) {
                                    System.out.println("Enemy party hs only one pokemon left!");
                                }
                            }
                        }
                        if (defender == this.PlayerPoke) {
                            if (this.Waiting.size() > 1) {
                                this.PlayerPoke = ThrowNew();
                                this.PlayerPoke.showAbility().resolveStart(
                                        this.PlayerPoke, this.AIPoke, this.weather);
                            }
                            if (this.Waiting.size() <= 1) {
                                System.out.println("You do not have another pokemon to switch out with!");
                            }
                        }
                    }
                    if (SelectMove.showBatonPass()) {
                        double speedMult = attacker.showSpeedMult();
                        double physDefMult = attacker.showDefMult();
                        double specDefMult = attacker.showSpecDefMult();
                        double accMult = attacker.showAccMult();
                        double evasMult = attacker.showEvasMult();
                        double physAttMult = attacker.showAttMult();
                        double specAttMult = attacker.showSpecAttMult();
                        if (attacker == this.PlayerPoke) {
                            if (this.Waiting.size() > 1) {
                                this.PlayerPoke.setSubstituteHP(0);
                                this.PlayerPoke = ThrowNew();
                            }
                            if (this.Waiting.size() <= 1) {
                                System.out.println("You do not have another pokemon to switch out with!");
                            }
                            this.PlayerPoke = ThrowNew();
                            this.PlayerPoke.showAbility().resolveStart(
                                    this.PlayerPoke, this.AIPoke, this.weather);
                        }
                        if (attacker == this.AIPoke) {
                            if (!this.type.equals("Wild")) {
                                if (this.AIParty.size() > 1) {
                                    getNextAIPoke();
                                    this.AIPoke.setJustThrown();
                                }
                                if (this.AIParty.size() <= 1) {
                                    System.out.println("Enemy party hs only one pokemon left!");
                                }
                            }
                        }
                        attacker.changeSpecDefMult(specDefMult);
                        attacker.changeSpecAttMult(specAttMult);
                        attacker.changeAccMult(accMult);
                        attacker.changeAttMult(physAttMult);
                        attacker.changeEvasMult(evasMult);
                        attacker.changeDefMult(physDefMult);
                        attacker.changeSpeedMult(speedMult);
                    }
                }
                if (!attacker.showFrozen() && !attacker.showAsleep() && !Paralyzed && !Infatuated && !SelectMove.showName().equals("Confusion Damage") && !defender.showChargeProtect() && SelectMove.showHealOrDamage()) {
                    Boolean heal = false;
                    if (attacker == PlayerPoke) {
                        Scanner scan = new Scanner(System.in);
                        String choice = "";
                        Boolean healoratt = false;
                        while (!healoratt) {
                            System.out.println("Heal Self (1) or Attack Enemy (2)?");
                            choice = scan.nextLine();
                            if (choice.equals("1") || choice.equals("2")) {
                                healoratt = true;
                                if (choice.equals("1")) {
                                    heal = true;
                                }
                            }
                        }
                    }
                    if (attacker == this.AIPoke) {
                        if (Math.random() >= .5) {
                            heal = true;
                        }
                    }
                    if (heal) {
                        SelectMove.showHealAm(this.weather, attacker);
                    }
                    if (!heal) {
                        if (attacker == this.PlayerPoke) {
                            DamageDealt = SelectMove.damageDealt(
                                    attacker, attacker, this.weather,
                                    this.PlayerPoke, this.terrain,
                                    this.Waiting, enemyMove, this.isFirst,
                                    magicRoom);
                            System.out.println("Your " + this.PlayerPoke.showName()
                                    + " dealt " + DamageDealt + " damage!");
                            if (defender.showSubstituteHP() <= 0 || SelectMove.showIgnoreSubstitute()) {
                                defender.changeHP(DamageDealt);
                                defender.damageSubstitute(DamageDealt);
                            }
                            if (defender.showSubstituteHP() > 0 && !SelectMove.showIgnoreSubstitute()) {
                                defender.damageSubstitute(DamageDealt);
                                if (defender.showSubstituteHP() <= 0) {
                                    System.out.println("Enemy " + defender.showName() + " decoy broke!");
                                }
                            }
                            if (SelectMove.showDamBackHeal()) {
                                int Heal = (int) Math.round(DamageDealt / SelectMove.showBackHealAm());
                                System.out.println("Your " + PlayerPoke.showName() + " healed for " + DamageDealt + " !");
                                attacker.changeHP(-1 * Heal);
                            }
                        }
                        if (attacker == AIPoke) {
                            if ((SelectMove.dealsDamage) &&
                                    (this.AIChargeTimer <= 0)) {
                                DamageDealt = SelectMove.damageDealt(
                                        attacker, attacker, this.weather,
                                        this.PlayerPoke, this.terrain,
                                        this.Waiting, enemyMove, this.isFirst,
                                        magicRoom);
                                System.out.println("Enemy " + AIPoke.showName() +
                                        " dealt " + DamageDealt + " damage!");
                                if (defender.showSubstituteHP() <= 0 ||
                                        SelectMove.showIgnoreSubstitute()) {
                                    defender.changeHP(DamageDealt);
                                    defender.setPreviousDamage(DamageDealt);
                                    if(this.PlayerPoke.getBideDamage() > 0 || enemyMove.showName().equals("Bide")){
                                        this.PlayerPoke.setBideDamage(DamageDealt);
                                    }
                                }
                                if (defender.showSubstituteHP() > 0 &&
                                        !SelectMove.showIgnoreSubstitute()) {
                                    defender.damageSubstitute(DamageDealt);
                                    if (defender.showSubstituteHP() <= 0) {
                                        System.out.println("Enemy " +
                                                defender.showName() +
                                                " decoy broke!");
                                    }
                                }
                            }
                        }
                    }
                }
                if (attacker.showAsleep()) {
                    sleepTimer -= 1;
                    System.out.println(attacker.showName() + " is still asleep!");
                    if (SelectMove.showName().equals("Snore")) {
                        DamageDealt = SelectMove.damageDealt(
                                attacker, attacker, this.weather,
                                this.PlayerPoke, this.terrain,
                                this.Waiting, enemyMove, this.isFirst,
                                magicRoom);
                        if (attacker == this.PlayerPoke) {
                            System.out.println("Your " +
                                    this.PlayerPoke.showName() +
                                    " dealt " + DamageDealt + " damage!");
                            if (defender.showSubstituteHP() <= 0 ||
                                    SelectMove.showIgnoreSubstitute()) {
                                defender.changeHP(DamageDealt);
                                defender.setPreviousDamage(DamageDealt);
                                if(this.AIPoke.getBideDamage() > 0 || enemyMove.showName().equals("Bide")){
                                    this.AIPoke.setBideDamage(DamageDealt);
                                }
                            }
                            if (defender.showSubstituteHP() > 0 &&
                                    !SelectMove.showIgnoreSubstitute()) {
                                defender.damageSubstitute(DamageDealt);
                                if (defender.showSubstituteHP() <= 0) {
                                    System.out.println("Enemy " + defender.showName() + " decoy broke!");
                                }
                            }
                            if (defender.showEndures()) {
                                if (defender.showHP() <= 0) {
                                    defender.setHP(1);
                                }
                            }
                        }
                        if (attacker == AIPoke) {
                            System.out.println("Enemy " + AIPoke.showName() + " dealt " + DamageDealt + " damage!");
                            if (defender.showSubstituteHP() <= 0 || SelectMove.showIgnoreSubstitute()) {
                                defender.changeHP(DamageDealt);
                                defender.setPreviousDamage(DamageDealt);
                                if(this.PlayerPoke.getBideDamage() > 0 || enemyMove.showName().equals("Bide")){
                                    this.PlayerPoke.setBideDamage(DamageDealt);
                                }
                            }
                            if (defender.showSubstituteHP() > 0 && !SelectMove.showIgnoreSubstitute()) {
                                defender.damageSubstitute(DamageDealt);
                                if (defender.showSubstituteHP() <= 0) {
                                    System.out.println("Enemy " + defender.showName() + " decoy broke!");
                                }
                            }
                            if (defender.showEndures()) {
                                if (defender.showHP() <= 0) {
                                    defender.setHP(1);
                                }
                            }
                        }
                    }
                    if (sleepTimer <= 0) {
                        attacker.Wake();
                        System.out.println(attacker.showName() + " woke up!");
                    }
                    SelectMove.StatusAffectsPPChange();
                }
                if (attacker.showFrozen()) {
                    int unfreeze = (int) (Math.random() * 9);
                    System.out.println(attacker.showName() + " is still frozen!");
                    if (unfreeze <= 2) {
                        attacker.unFreeze();
                        System.out.println(attacker.showName() + " thawed!");
                    }
                    SelectMove.StatusAffectsPPChange();
                }
                if (Paralyzed) {
                    System.out.println(attacker.showName() + " is fully paralyzed!");
                }
                if (Infatuated) {
                    System.out.println(attacker.showName() + " is too in love to fight!");
                }
                if (newMove.equals("Sleep Talk")) {
                    attacker.Sleep();
                }
                if (attacker.showFlinched()) {
                    System.out.println(attacker.showName() + " flinched!");
                    attacker.unFlinch();
                }
            }
        }
        else {
            System.out.println(getAttackerName(defender) + "'s " + defender.showAbility().showName() +
                    " defends the defender from the attack.");
        }
    }

    private void endTurn(Pokemon defender, Pokemon attacker){
        int DamageDealt;
        if(attacker == this.PlayerPoke) {
            if(this.AIPoke.getBideDamage() > 0){
                this.playerFutureDamage = this.AIPoke.getBideDamage();
            }
            if(this.playerFutureDamage != 0){
                this.playerFutureDamageTimer -= 1;
                if(this.playerFutureDamageTimer == 0){
                    System.out.println("The forseen damage came!");
                    attacker.changeHP(this.playerFutureDamage);
                    this.playerFutureDamage = 0;
                }
            }
            if(attacker.getSpecialEvolReq()){
                Scanner scan = new Scanner(System.in);
                System.out.println(attacker.showName() + " can evolve. Do you accept?");
                String Ev = scan.nextLine();
                if (Ev.equals("y")) {
                    this.PlayerPoke = evolvePoke(this.globalVariables, this.PlayerPoke);
                    this.Waiting.remove(attacker);
                    this.Waiting.add(this.PlayerPoke);
                    System.out.println(attacker.showName() + " has evolved!");
                }
            }
        }
        if(attacker == this.AIPoke) {
            if(this.AIFutureDamage != 0){
                if(this.PlayerPoke.getBideDamage() > 0){
                    this.AIFutureDamage = this.PlayerPoke.getBideDamage();
                }
                this.AiFutureDamageTimer -= 1;
                if(this.AiFutureDamageTimer == 0){
                    System.out.println("The forseen damage came!");
                    attacker.changeHP(this.AIFutureDamage);
                    this.AIFutureDamage = 0;
                }
            }
        }
        attacker.endTurnHeal();
        attacker.setPreviousDamage(0);
        attacker.tickDownCannotHaveStatLowered();
        attacker.tickDownProhibitedMoves();
        attacker.tickDownHasElectricCharge();
        attacker.tickDownOutrageTimer();
        if(attacker.getOutrageTimer() <= 0){
            attacker.resetOutrage();
        }
        attacker.tickDownConfuseTimer();
        if(attacker.getConfuseTimer() == 0){
            System.out.println(attacker.showName() + " is no longer confused!");
            attacker.unConfuse();
        }
        attacker.changeTormentTimer(-1);
        if(attacker.getTormentTimer() <= 0){
            attacker.resetIsTorment();
        }
        attacker.changeNoItemTimer(-1);
        if(attacker.getNoItemTimer() <= 0){
            attacker.resetCannotUseItems();
        }
        attacker.changeAccTimer(-1);
        attacker.changePhysAttTimer(-1);
        attacker.changeSpecAttTimer(-1);
        attacker.changeEvasTimer(-1);
        attacker.changePhysDefTimer(-1);
        attacker.changeSpecDefTimer(-1);
        attacker.changeStatChangeTimer(-1);
        attacker.changeSpeedTimer(-1);
        attacker.changeCritTimer(-1);
        attacker.resetJustThrown();
        attacker.resetTookDamage();
        attacker.resetPhysWall();
        attacker.resetSpecWall();
        attacker.tickDownLevitateTimer();
        attacker.tickDownSetFallAsleep();
        if(attacker.getIsProtected()) {
            attacker.endProtection();
            System.out.println("Protection Ended!");
        }
        if(attacker.showEndures()) {
            attacker.resetEndures();
            System.out.println("No longer enduring!");
        }
        attacker.unCharge();
        if(this.terrainTicker == 0){
            System.out.println("The terrain wore off! The terrain is returning to " + savedTerrain.showName());
            this.terrain = this.savedTerrain;
        }
        this.weatherTicker -= 1;
        if(this.weatherTicker == 0){
            this.weather = this.savedWeather;
            System.out.println("Weather is back to " + weather.showName());
        }
        if(attacker.showStatChangeTimer() == 0){
            attacker.resetNoStatChange();
            if(attacker == PlayerPoke){
                System.out.println("Your " + attacker.showName() + " is susceptible to status changes!");
            }
            if(attacker == AIPoke){
                System.out.println("Enemy " + attacker.showName() + " is susceptible to status changes!");
            }
        }
        if(attacker.showAccTimer() == 0) {
            attacker.resetAccMult();
            if(attacker == PlayerPoke){
                System.out.println("Your " + attacker.showName() + "'s accuracy multiplier wore off!");
            }
            if(attacker == AIPoke){
                System.out.println("Enemy " + attacker.showName() + "'s multiplier wore off!");
            }
        }
        if(attacker.showCritTimer() == 0) {
            attacker.resetIsCritUp();
            if(attacker == PlayerPoke){
                System.out.println("Your " + attacker.showName() + "'s critical multiplier wore off!");
            }
            if(attacker == AIPoke){
                System.out.println("Enemy " + attacker.showName() + "'s critical multiplier wore off!");
            }
        }
        if(attacker.showPhysAttTimer() == 0){
            attacker.resetAttMult();
            if(attacker == PlayerPoke){
                System.out.println("Your " + attacker.showName() + "'s attack multiplier wore off!");
            }
            if(attacker == AIPoke){
                System.out.println("Enemy " + attacker.showName() + "'s attack multiplier wore off!");
            }
        }
        if(attacker.showSpecAttTimer() == 0) {
            attacker.resetSpecAttMult();
            if(attacker == PlayerPoke){
                System.out.println("Your " + attacker.showName() + "'s special attack multiplier wore off!");
            }
            if(attacker == AIPoke){
                System.out.println("Enemy " + attacker.showName() + "'s special attack multiplier wore off!");
            }
        }
        if(attacker.showPhysDefTimer() == 0){
            attacker.resetDefMult();
            if(attacker == PlayerPoke){
                System.out.println("Your " + attacker.showName() + "'s defense multiplier wore off!");
            }
            if(attacker == AIPoke){
                System.out.println("Enemy " + attacker.showName() + "'s defense multiplier wore off!");
            }
        }
        if(attacker.showSpecDefTimer() == 0){
            attacker.resetSpecDefMult();
            if(attacker == PlayerPoke){
                System.out.println("Your " + attacker.showName() + "'s special defense multiplier wore off!");
            }
            if(attacker == AIPoke){
                System.out.println("Enemy " + attacker.showName() + "'s special defense multiplier wore off!");
            }
        }
        if(attacker.showEvasTimer() == 0) {
            attacker.resetEvasMult();
            if(attacker == PlayerPoke){
                System.out.println("Your " + attacker.showName() + "'s evasion multiplier wore off!");
            }
            if(attacker == AIPoke){
                System.out.println("Enemy " + attacker.showName() + "'s evasion multiplier wore off!");
            }
        }
        if(attacker.showSpeedTimer() == 0) {
            attacker.resetSpeedMult();
            if(attacker == PlayerPoke){
                System.out.println("Your " + attacker.showName() + "'s speed multiplier wore off!");
            }
            if(attacker == AIPoke){
                System.out.println("Enemy " + attacker.showName() + "'s speed multiplier wore off!");
            }
        }
        if(attacker.showinVortex()){
            attacker.showVortex().tickTurnLength();
            attacker.showVortex().vortexDamage(attacker);
            if(attacker.showVortex().showTurnLength() == 0){
                defender.showVortex().endVortex(defender);
            }
        }
        if(attacker.showPoisoned()) {
            DamageDealt = (int) Math.round(defender.showSavedHP() * (1.0 / 16));
            defender.changeHP(DamageDealt);
            if (attacker == PlayerPoke) {
                System.out.println("Your " + PlayerPoke.showName() + " dealt " + DamageDealt + " damage due to the poison!");
            }
            if (attacker == AIPoke) {
                System.out.println("Enemy " + AIPoke.showName() + " dealt " + DamageDealt + " damage due to the poison!");
            }
        }
        if(attacker.showBurn()) {
            DamageDealt = (int) Math.round(defender.showSavedHP() * (1.0 / 16));
            defender.changeHP(DamageDealt);
            if (attacker == PlayerPoke) {
                System.out.println("Your " + PlayerPoke.showName() + " dealt " + DamageDealt + " damage due to the burn!");
            }
            if (attacker == AIPoke) {
                System.out.println("Enemy " + AIPoke.showName() + " dealt " + DamageDealt + " damage due to the burn!");
            }
        }
        if(defender.showSeeded()){
            DamageDealt = (int) Math.round(defender.showSavedHP() * (1.0/8));
            if (attacker == PlayerPoke) {
                System.out.println("Your " + PlayerPoke.showName() + " dealt " + DamageDealt + " damage due to the seed!");
            }
            if (attacker == AIPoke) {
                System.out.println("Enemy " + AIPoke.showName() + " dealt " + DamageDealt + " damage due to the seed!");
            }
            defender.changeHP(DamageDealt);
            if (attacker == PlayerPoke) {
                System.out.println("Your " + PlayerPoke.showName() + " healed for " + DamageDealt + " damage due to the seed!");
            }
            if (attacker == AIPoke) {
                System.out.println("Enemy " + AIPoke.showName() + " healed " + DamageDealt + " damage due to the seed!");
            }
            attacker.changeHP(-DamageDealt);
            if (attacker.showHP() > attacker.showSavedHP()) {
                attacker.resetHP();
            }
        }
        if(this.weather.showDealsDamage() && !attacker.showAbility().getIgnoresWeather()){
            if(!this.weather.showProtectedType().contains(attacker.showType1())
                    && !this.weather.showProtectedType().contains(attacker.showType2())){
                DamageDealt = (int) Math.round(defender.showSavedHP() * (1.0 / 16));
                attacker.changeHP(-1 * DamageDealt);
                System.out.println(getAttackerName(attacker) +
                        " healed " + DamageDealt + " due to the " +
                        this.weather.showName() + "!");
            }
        }
        if(this.terrain.showName().equals("Grassy")){
            if(!attacker.showFloats() &&
                    !attacker.showType2().equals("Flying") && !attacker.showType1().equals("Flying")){
                DamageDealt = (int) Math.round(defender.showSavedHP() * (1.0 / 16));
                attacker.changeHP(-1 * DamageDealt);
                if (attacker == this.PlayerPoke) {
                    System.out.println("Your " + this.PlayerPoke.showName() + " healed " + DamageDealt + " due to the Grassy Terrain!");
                }
                if (attacker == AIPoke) {
                    System.out.println("Enemy " + AIPoke.showName() + " healed " + DamageDealt + " due to the Grassy Terrain!");
                }
            }
            if(attacker.showFloats()){
                System.out.println("Floating pokemon do not receive terrain benefits!");
            }
            if(attacker.showType2().equals("Flying") || attacker.showType1().equals("Flying")){
                System.out.println("Flying pokemon do not receive terrain benefits!");
            }
        }
        if(attacker.showAbility().showResolveOnEnd()){
            attacker.showAbility().resolveEndTurn(attacker);
        }
        for(Moves moves : attacker.showMoves()){
            moves.tickDownDisabledTimer();
        }
    }
    private Moves AISelectMoves() {
        List<Moves> MoveList = this.AIPoke.showMoves();
        Moves Selected;
        List<Moves> trueMoveList = new ArrayList<>();
        int out = 0;
        for (int i = 0; i < MoveList.size(); ++i) {
            if(MoveList.get(i).showPP() == 0 ||
            (this.AIPoke.getIsImprisoned() && this.PlayerPoke.showMoves().contains(MoveList.get(i)))
            || (MoveList.get(i).getUsesPerBattle() == 0)
            || (this.AIPoke.getProhibitedMoves().contains(MoveList.get(i).showName()))){
                out += 1;
            }
            else {
                trueMoveList.add(MoveList.get(i));
            }
        }
        if(out == MoveList.size()){
            System.out.println("Out of moves! " + this.AIPoke.showName() + " can only struggle!");
            Selected = new Struggle();
        }
        else {
            Selected = trueMoveList.get(new Random().nextInt(trueMoveList.size()));
            if(this.AIPoke.getTormented()){
                while(Selected == this.AIForcedMove){
                    Selected = trueMoveList.get(new Random().nextInt(trueMoveList.size()));
                }
            }
        }
        if(Selected.showName().equals("Mirror Move")){
            Selected = this.PlayerSelectedMove;
        }
        return Selected;
    }

    private Moves SelectMove() {
        System.out.println("What Move are you using?");
        List<String> AvailableMoves = new ArrayList<>();
        Boolean again = true;
        while (again) {
            for (Moves MoveCheck : this.PlayerPoke.showMoves()) {
                List<Integer> PP = new ArrayList<>();
                PP.add(MoveCheck.showPP());
                int PPcheck = 0;
                for (int PPnumbers : PP) {
                    PPcheck += PPnumbers;
                }
                if (PPcheck != 0) {
                    int ticker = 0;
                    List<String> tickerList = new ArrayList<>();
                    Scanner scan = new Scanner(System.in);
                    for (Moves move : this.PlayerPoke.showMoves()) {
                        if ((this.PlayerPoke.getIsImprisoned() && !this.AIPoke.showMoves().contains(move))
                            || (!this.PlayerPoke.getIsImprisoned() && !move.showName().equals("Last Resort"))
                            || !this.PlayerPoke.getProhibitedMoves().contains(move.showName())) {
                            AvailableMoves.add(move.showName());
                            ticker += 1;
                            String tickerString = Integer.toString(ticker);
                            tickerList.add(tickerString);
                            System.out.println(move.showName() + " (" + ticker + ")" + " has " + move.showPP() + " PP left.");
                        }
                    }
                    String SelectedMove = scan.nextLine();
                    if ((AvailableMoves.contains(SelectedMove)) || (tickerList.contains(SelectedMove))) {
                        Boolean selectedTicker = false;
                        int tickerNum = 0;
                        if (tickerList.contains(SelectedMove)) {
                            selectedTicker = true;
                            tickerNum = Integer.valueOf(SelectedMove);
                        }
                        for (Moves moves : PlayerPoke.showMoves()) {
                            if (moves.showName().equals(SelectedMove)) {
                                if (moves.showPP() != 0 &&
                                    (PlayerPoke.getIsImprisoned() &&
                                            !AIPoke.showMoves().contains(SelectedMove)) ||
                                    !PlayerPoke.getIsImprisoned() &&
                                    !SelectedMove.equals("Last Resort")) {
                                    return moves;
                                }
                                if(SelectedMove.equals("Last Resort") && AvailableMoves.size() == 1){
                                    return moves;
                                }
                                if (moves.showPP() == 0) {
                                    System.out.println("Out of PP!");
                                }
                            }
                            if (selectedTicker) {
                                if (this.PlayerPoke.showMoves().get(tickerNum - 1) == moves) {
                                    if (moves.showPP() != 0) {
                                        if(moves.showName().equals("Mirror Move")){
                                            moves = this.AISelectedMove;
                                        }
                                        return moves;
                                    }
                                    if (moves.showPP() == 0) {
                                        System.out.println("Out of PP!");
                                    }
                                }
                            }
                        }
                    }
                }
                if (PPcheck == 0) {
                    System.out.println("Out of moves! " + PlayerPoke.showName() + " can only struggle!");
                    Moves SelectedMove = new Struggle();
                    return SelectedMove;
                }
            }
            System.out.println("That is not an available move.");
        }
        return null;
    }

    private Boolean isFirst() {
        Boolean first = null;
        if(this.PlayerSelectedMove.getGoesFirst()){
            return true;
        }
        if(this.AISelectedMove.getGoesFirst()){
            return false;
        }
        if (this.PlayerPoke.showSpeed(
                this.PlayerSelectedMove.getSpeedPriority())
                > this.AIPoke.showSpeed(
                        this.AISelectedMove.getSpeedPriority())) {
            first = true;
        }
        else if (this.PlayerPoke.showSpeed(
                this.PlayerSelectedMove.getSpeedPriority()) <
                this.AIPoke.showSpeed(
                        this.AISelectedMove.getSpeedPriority())) {
            first = false;
        }
        else {
            double chance = Math.random();
            if (chance >= .5) {
                first = true;
            }
            if (chance < .5) {
                first = false;
            }
        }
        if(this.isTrickRoom > 0){
            if(first){
                first = false;
            }
            else {
                first = true;
            }
        }
        return first;
    }

    private String getAttackerName(Pokemon attacker){
        String name = attacker.showName();
        if (attacker == this.PlayerPoke){
            return "Your " + name;
        }
        else {
            return "Enemy " + name;
        }
    }

    private void getNextAIPoke(){
        this.AIPoke.resetForThrow();
        this.AIPoke = this.AIParty.get(
                this.AIParty.indexOf(this.AIPoke) + 1);
        this.AIPoke.showAbility().resolveStart(
                this.AIPoke, this.PlayerPoke, this.weather);
        this.AIPoke.setThrownOnFaint();
        this.affectsGround.AIPokeGroundOnSwitch(this.AIPoke,
                this.PlayerPoke);
    }
}
