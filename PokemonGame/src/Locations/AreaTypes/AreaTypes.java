package Locations.AreaTypes;

import AIMechanics.AIPokeParty;
import BackgroundMusic.MusicCode.PlayTrainerBattleMusic;
import BackgroundMusic.MusicCode.PokeCenter;
import BackgroundMusic.MusicCode.VictoryMusic;
import BattleMechanics.Battle;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Interfaces.WeightedEnteries;
import Locations.WorldMap;
import PlayerMechanics.*;
import PokemonCreation.Pokemon;
import UserInterfaces.ChangeAreaScreen;
import UserInterfaces.HomeScreen;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class AreaTypes {
    protected boolean isHome = false;
    protected boolean isRoute = false;
    protected boolean isStore = false;
    protected boolean isGym = false;
    protected boolean isTown = false;
    protected List<AreaTypes> previousAreas = new ArrayList();
    protected List<AreaTypes> nextAreas = new ArrayList();
    protected String name= "";
    protected int amountOfTimes = 0;
    protected List<AreaTypes> allPossibleAreas = new ArrayList<>();
    protected List<Integer> onTickerEvents = new ArrayList<>();
    protected int levelRange = 0;
    protected int minLevel = 0;
    protected ArrayList<CreateOrderedMap<Integer, Integer>> dayChance = new ArrayList<>();
    protected ArrayList<CreateOrderedMap<Integer, Integer>> champDayChance = new ArrayList<>();
    protected ArrayList<CreateOrderedMap<Integer, Integer>> nightChance = new ArrayList<>();
    protected ArrayList<CreateOrderedMap<Integer, Integer>> champNightChance = new ArrayList<>();
    protected ArrayList<CreateOrderedMap<Integer, Integer>> heabuttChance = new ArrayList<>();
    protected ArrayList<CreateOrderedMap<Integer, Integer>> champHeadChance = new ArrayList<>();
    protected ArrayList<CreateOrderedMap<Integer, Integer>> swarmChance = new ArrayList<>();
    protected ArrayList<CreateOrderedMap<Integer, Integer>> champSwarmChance = new ArrayList<>();
    protected ArrayList<CreateOrderedMap<Integer, Integer>> soundChance = new ArrayList<>();
    protected ArrayList<CreateOrderedMap<Integer, Integer>> champSoundChance = new ArrayList<>();
    protected ArrayList<CreateOrderedMap<Integer, Integer>> flightChance = new ArrayList<>();
    protected ArrayList<CreateOrderedMap<Integer, Integer>> champFlightChance = new ArrayList<>();
    protected ArrayList<CreateOrderedMap<Integer, Integer>> trainerChance = new ArrayList<>();
    protected WeightedEnteries<Integer> pokeChanceDay = new WeightedEnteries<>();
    protected WeightedEnteries<Integer> pokeChanceNight = new WeightedEnteries<>();
    protected WeightedEnteries<Integer> pokeChanceHeadbutt = new WeightedEnteries<>();
    protected WeightedEnteries<Integer> pokeChanceSwarm = new WeightedEnteries<>();
    protected WeightedEnteries<Integer> pokeChanceSound = new WeightedEnteries<>();
    protected WeightedEnteries<Integer> pokeChanceFlight = new WeightedEnteries<>();
    protected WeightedEnteries<Integer> trainerPokeChance = new WeightedEnteries<>();

    public void championPokeChances(){
        this.trainerPokeChance.clearEntries();
        this.trainerChance.addAll(this.champDayChance);
        this.trainerChance.addAll(this.champNightChance);
        this.trainerChance.addAll(this.champHeadChance);
        this.trainerChance.addAll(this.champSwarmChance);
        this.trainerChance.addAll(this.champSoundChance);
        this.trainerChance.addAll(this.champFlightChance);
        for(CreateOrderedMap<Integer, Integer> day : this.champDayChance){
            this.pokeChanceDay.addEntry(day.getKey(), day.getValue());
        }
        for(CreateOrderedMap<Integer, Integer> night : this.champNightChance){
            this.pokeChanceNight.addEntry(night.getKey(), night.getValue());
        }
        for(CreateOrderedMap<Integer, Integer> swarm : this.champSwarmChance){
            this.pokeChanceSwarm.addEntry(swarm.getKey(), swarm.getValue());
        }
        for(CreateOrderedMap<Integer, Integer> headbutt : this.champHeadChance){
            this.pokeChanceHeadbutt.addEntry(headbutt.getKey(), headbutt.getValue());
        }
        for(CreateOrderedMap<Integer, Integer> sound : this.champSoundChance){
            this.pokeChanceSound.addEntry(sound.getKey(), sound.getValue());
        }
        for(CreateOrderedMap<Integer, Integer> sound : this.champFlightChance){
            this.pokeChanceFlight.addEntry(sound.getKey(), sound.getValue());
        }
        for(CreateOrderedMap<Integer, Integer> sound : this.trainerChance){
            this.trainerPokeChance.addEntry(sound.getKey(), sound.getValue());
        }

    }
    protected void createPokeChances(){
        this.trainerChance.addAll(this.dayChance);
        this.trainerChance.addAll(this.nightChance);
        this.trainerChance.addAll(this.heabuttChance);
        this.trainerChance.addAll(this.swarmChance);
        this.trainerChance.addAll(this.soundChance);
        this.trainerChance.addAll(this.flightChance);
        for(CreateOrderedMap<Integer, Integer> day : this.dayChance){
            this.pokeChanceDay.addEntry(day.getKey(), day.getValue());
        }
        for(CreateOrderedMap<Integer, Integer> night : this.nightChance){
            this.pokeChanceNight.addEntry(night.getKey(), night.getValue());
        }
        for(CreateOrderedMap<Integer, Integer> swarm : this.swarmChance){
            this.pokeChanceSwarm.addEntry(swarm.getKey(), swarm.getValue());
        }
        for(CreateOrderedMap<Integer, Integer> headbutt : this.heabuttChance){
            this.pokeChanceHeadbutt.addEntry(headbutt.getKey(), headbutt.getValue());
        }
        for(CreateOrderedMap<Integer, Integer> sound : this.soundChance){
            this.pokeChanceSound.addEntry(sound.getKey(), sound.getValue());
        }
        for(CreateOrderedMap<Integer, Integer> sound : this.flightChance){
            this.pokeChanceFlight.addEntry(sound.getKey(), sound.getValue());
        }
        for(CreateOrderedMap<Integer, Integer> sound : this.trainerChance){
            this.trainerPokeChance.addEntry(sound.getKey(), sound.getValue());
        }
    }

    public WeightedEnteries<Integer> getPokeChanceHeadbutt(){return this.pokeChanceHeadbutt;}
    public WeightedEnteries<Integer>  getPokeChanceDay(){return this.pokeChanceDay;}
    public WeightedEnteries<Integer>  getPokeChanceNight(){return this.pokeChanceNight;}
    public WeightedEnteries<Integer>  getPokeChanceSwarm(){return this.pokeChanceSwarm;}
    public WeightedEnteries<Integer>  getPokeChanceSound(){return this.pokeChanceSound;}
    public WeightedEnteries<Integer> getTrainerPokeChance(){return this.trainerPokeChance;}

    private void healPokemon(PlayerParty playerParty){
        for(Pokemon poke : playerParty.getCurrentParty()){
            poke.visitNurse();
        }
    }
    public String getType(){
        if(this.isHome){
            return "Home";
        }
        if(this.isTown){
            return "Town";
        }
        if(this.isGym){
            return "Gym";
        }
        if(this.isRoute){
            return "Route";
        }
        if(this.isStore){
            return "Center";
        }
        return null;
    }

    public int getLevelRange(){return this.levelRange;}
    public int getMinLevel(){return this.minLevel;}
    public String getName(){
        return this.name;
    }
    public void addToNextArea(AreaTypes nextArea){
        this.nextAreas.add(nextArea);
    }
    public void addToPreviousArea(AreaTypes prevArea){
        this.previousAreas.add(prevArea);
    }
    public void addToTotalAreas(AreaTypes posArea){
        this.allPossibleAreas.add(posArea);
    }
    public List<AreaTypes> getPreviousAreas(){
        return this.previousAreas;
    }
    public List<AreaTypes> getNextAreas(){
        return this.nextAreas;
    }
    public List<AreaTypes> getAllPossibleAreas(){
        return this.allPossibleAreas;
    }

    public AreaTypes resolveCurrentArea(GlobalVariables globalVariables) throws InterruptedException {
        this.amountOfTimes += 1;
        if(this.onTickerEvents.contains(this.amountOfTimes)){
            System.out.println("EVENT HERE");
        }
        if (this.isHome) {
            resolveHome(globalVariables);
        }
        if (this.isRoute) {
            if(!resolveBattle(globalVariables)){
                return runToCenter(globalVariables);
            }
        }
        if (this.isStore) {
            resolveCenter(globalVariables);
        }
        if (this.isGym){
            resolveGym();
        }
        if (this.isTown){
            resolveTown();
        }
        return new ChangeAreaScreen().getNewArea(this, globalVariables.getGameScreen());
    }

    private AreaTypes runToCenter(GlobalVariables globalVariables){
        globalVariables.getWorldMap().setLostBattle();
        for (AreaTypes findCenter : this.previousAreas){
            if(findCenter.isHome || findCenter.isStore){
                return findCenter;
            }
        }
        for (AreaTypes findCenter : this.previousAreas) {
            for (AreaTypes findCenter2 : findCenter.previousAreas) {
                if (findCenter2.isHome || findCenter2.isStore) {
                    return findCenter2;
                }
            }
        }
        return globalVariables.getWorldMap().goHome();
    }

    private void resolveCenter(GlobalVariables globalVariables) {
        String choice = "";
        Scanner scan = new Scanner(System.in);
        List<String> Options = new ArrayList<>();
        List<String> Options2 = new ArrayList<>();
        Options.add("Next");
        Options2.add("0");
        Options.add("View Computer");
        Options2.add("1");
        Options.add("View TMs");
        Options2.add("2");
        Options.add("View Party");
        Options2.add("3");
        while (!choice.equals("next") && !choice.equals("1")) {
            int index = 0;
            System.out.println("What would you like to do? ");
            while (index < 3) {
                System.out.println(Options.get(index) + " [" + Options2.get(index) + "]");
                index += 1;
            }
            choice = scan.nextLine();
            if (Options.contains(choice)) {
                if (choice.equals(Options.get(0)) || choice.equals(Options2.get(0))) {
                    System.out.println("Get Ready!");
                }
                if (choice.equals(Options.get(1)) || choice.equals(Options2.get(1))) {
                    globalVariables.getComputer().accessComp(globalVariables);
                }
                if (choice.equals(Options.get(2)) || choice.equals(Options2.get(2))) {
                    globalVariables.getTMInventory().accessTMs(globalVariables);
                }
                if (choice.equals(Options.get(3)) || choice.equals(Options2.get(3))) {
                    System.out.println(globalVariables.getParty().getCurrentParty());
                }
            }
        }
    }

    private void resolveHome(GlobalVariables globalVariables) {
        if(globalVariables.getWorldMap().getLostBattle()){
            globalVariables.getWorldMap().resetLostBattle();
            healPokemon(globalVariables.getParty());
        }
        while (true) {
            String toDo = new HomeScreen().doHome(globalVariables.getGameScreen());
            if(toDo.equals("Heal")){
                healPokemon(globalVariables.getParty());
            }
            if (toDo.equals("Move")) {
                return;
            }
        }
    }

    private Boolean resolveBattle(GlobalVariables globalVariables) throws InterruptedException {
        PlayTrainerBattleMusic TrainerMusic;
        Battle battle;
        if(new Random().nextInt(4) > 2) {
            TrainerMusic = new PlayTrainerBattleMusic("Trainer");
            TrainerMusic.start();
            battle = new Battle(globalVariables, "Trainer", AIPokeParty.chooseTrainerAIPoke(this, globalVariables));
        }
        else {
            TrainerMusic = new PlayTrainerBattleMusic("Wild");
            TrainerMusic.start();
            battle = new Battle(globalVariables, "Wild", AIPokeParty.chooseWildAIPoke(this, globalVariables));
        }
        Boolean battleResult = battle.CompleteFight();
        try {
            TrainerMusic.interrupt();
        } catch (Exception e) {
        }
        if(battleResult){
            VictoryMusic VictoryMusic = new VictoryMusic();
            VictoryMusic.start();
            System.out.println("");
            System.out.println("YOU WIN!");
            globalVariables.getTMInventory().getARandomTM();
            TimeUnit.SECONDS.sleep(3);
            try {
                VictoryMusic.interrupt();
            } catch (Exception e) {
            }
        }
        return battleResult;
    }

    private void resolveGym(){}

    private void resolveTown(){}

}