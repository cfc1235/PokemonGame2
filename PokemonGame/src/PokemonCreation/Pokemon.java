package PokemonCreation;

import Interfaces.*;
import Items.NoItem;
import Moveset.OtherDamage.NoMove;
import PokemonCreation.AllAbilities.*;
import BattleMechanics.BaseVortex;
import BattleMechanics.Moves;
import BattleMechanics.Vortex.NoVortex;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Pokemon implements AddMoveset {
    protected CreateOrderedMap<Integer, Integer> PLACEHOLDER = new CreateOrderedMap<>(0, 0);
    protected List<Integer> EVs = new ArrayList<>();
    protected List<Integer> GivesEVs = new ArrayList<>();
    protected Items item = new NoItem();
    protected String name = "";
    protected int savedHP;
    protected int HP;
    protected int ID;
    protected int BaseDef;
    protected int BaseAtt;
    protected int BaseHP;
    protected int BaseSpecAtt;
    protected int BaseSpecDef;
    protected int BaseSp;
    protected String type1 = "";
    protected String type2 = "";
    protected Abilities ability = new Empty();
    protected List<Abilities> possibleAbilities = new ArrayList<>();
    protected List<Moves> moves = new ArrayList<>();
    protected List<Moves> TMmoves = new ArrayList<>();
    protected Integer EvolTiming = 101;
    protected int PhysDefense;
    protected int PhysAttack;
    protected int SpecAttack;
    protected int SpecDefense;
    protected int level;
    protected int Speed;
    protected String nature;
    protected double AccMulitplier = 0;
    protected double SavedAccMult = 0;
    protected double EvasMulitplier = 0;
    protected double SavedEvasMult = EvasMulitplier;
    protected double AttMultiplier = 0;
    protected double SavedAttMult= AttMultiplier;
    protected double DefMulitplier = 0;
    protected double SavedDefMult = DefMulitplier;
    protected double SpecAttMultiplier = 0;
    protected double SavedSpecAttMult = SpecAttMultiplier;
    protected double SpecDefMulitplier = 0;
    protected double SavedSpecDefMult = SpecDefMulitplier;
    protected double SpeedMultiplier = 0;
    protected double SavedSpeedMult = SpeedMultiplier;
    protected Boolean isSeeded = false;
    protected int totalEXP = 0;
    protected String EggGroup;
    protected int EXPNeeded;
    protected int NextLevelEXP;
    protected int CurrentEXP;
    protected int onDeathEXP;
    protected List<Integer> IV = new ArrayList<>();
    protected Boolean isPoisoned = false;
    protected double Weight = 0;
    protected int captureRate;
    protected Boolean isFrozen = false;
    protected Boolean isParalyzed = false;
    protected Boolean isAsleep = false;
    protected Boolean isBurned = false;
    protected Boolean hasGender = true;
    protected int Gender = (int) ((Math.random() * 2) + 1);
    protected String pokedexType;
    protected Abilities savedAbility = new Empty();
    protected int SpecAttTimer = 0;
    protected int PhysAttTimer = 0;
    protected int SpeedTimer = 0;
    protected int SpecDefTimer = 0;
    protected int PhysDefTimer = 0;
    protected int EvasTimer = 0;
    protected int AccTimer = 0;
    protected int critTimer = 0;
    protected Boolean noStatChange = false;
    protected int statChangeTimer = 0;
    protected Boolean isProtected = false;
    protected Boolean isInfatuated = false;
    protected Boolean isCharged = false;
    protected Boolean Floats = false;
    protected int substituteHP = 0;
    protected Boolean Endures = false;
    protected Moves OnEvol = new NoMove();
    protected Boolean isConfused = false;
    protected Boolean isFlinched = false;
    protected Boolean inVortex = false;
    protected Boolean vortexMove = false;
    protected BaseVortex vortex = new NoVortex();
    protected Boolean chargeProtect = false;
    protected Boolean isAlolan = false;
    protected Boolean isCritUp = false;
    protected Boolean justThrown = false;
    protected Boolean tookDamage = false;
    protected List<CreateOrderedMap<Integer, Moves>> learnedMoves = new ArrayList<>();
    protected Boolean willCrit = false;
    protected String shinyDirName = "C:\\Users\\chris\\IdeaProjects\\PokemonGame\\" +
            "PokemonGame\\src\\GraphicalImages\\Pokemon\\Shiny\\";
    protected String dirName = "C:\\Users\\chris\\IdeaProjects\\PokemonGame\\" +
            "PokemonGame\\src\\GraphicalImages\\Pokemon\\NonShiny\\";
    protected String fullDirName = "";
    protected Boolean isShiny = false;
    protected String pokeBallType = "Poke Ball";
    protected String pokeCry = "";
    protected Boolean timeEvolReq = false;
    //DAY IS TRUE, FALSE IS NIGHT
    protected Boolean timeReqdEvol = false;
    protected Boolean isTormented = true;
    protected int tormentTimer = 0;
    protected Boolean cannotUseItems = true;
    protected int noItemTimer = 0;
    protected Boolean hasPhysWall = false;
    protected int physWallTimer = 0;
    protected Boolean isImprisoned = false;
    protected Boolean hasSpecWall = false;
    protected int specWallTimer = 0;
    protected Boolean isOutraged = false;
    protected int outrageTimer = 0;
    protected Boolean forcedSitOut = false;
    protected int confuseTimer = 0;
    protected Boolean isFirst = false;
    protected Boolean levitates = false;
    protected Boolean fakeLevitates = false;
    protected int fakeLevitateTimer = 0;
    protected Boolean fallAsleep = false;
    protected int fallAsleepTimer = -1;
    protected Boolean hasElectricCharge = false;
    protected int electricChargeTimer = 0;
    protected Items savedItem;
    protected WeightedEnteries<Items> wildItem = new WeightedEnteries<>();
    protected ArrayList<CreateOrderedMap<Integer, Items>> possibleWildItems = new ArrayList<>();
    protected Boolean cannotFlee = false;
    protected Boolean cannotUseMove = false;
    protected ArrayList<CreateOrderedMap<String, Integer>> prohibitedMoves = new ArrayList<>();
    protected ArrayList<String> itemEvolReqs = new ArrayList<>();
    protected int stockpile = 0;
    protected int cannotHaveStatLowered = 0;
    protected Boolean cannotMiss = true;
    protected int savedAtt;
    protected int savedDef;
    protected int savedSpecAtt;
    protected int savedSpecDef;
    protected int savedSpeed;
    protected Boolean hasQuickGaurd = false;
    protected int previousDamage = 0;
    protected Boolean thrownOnFaint = false;
    protected String type4 = "";
    protected String type3 = "";

    public void setType3(String newType1){
        this.type3 = this.type1;
        this.type1 = newType1;
    }
    public void resetType3(){
        this.type1 = this.type3;
        this.type3 = "";
    }
    public void setType4(String newType2){
        this.type4 = this.type2;
        this.type2 = newType2;
    }
    public void resetType4(){
        this.type2 = this.type4;
        this.type4 = "";
    }
    public void setThrownOnFaint(){this.thrownOnFaint = true;}
    public void resetThrownOnFaint(){this.thrownOnFaint = false;}
    public Boolean getThrownOnFaint(){return this.thrownOnFaint;}
    public void setPreviousDamage(int damage){this.previousDamage = damage;}
    public int getPreviousDamage(){return this.previousDamage;}
    public void setHasQuickGaurd(){this.hasQuickGaurd = true;}
    public void resetHasQuickGuard(){this.hasQuickGaurd = false;}
    public Boolean getHasQuickGaurd(){return this.hasQuickGaurd;}
    public void setCannotMiss(){this.cannotMiss = true;}
    public void resetCannotMiss(){this.cannotMiss = false;}
    public Boolean getCannotMiss(){return this.cannotMiss;}
    public void resetCannotHaveStatLowered(){this.cannotHaveStatLowered = 0;}
    public int getCannotHaveStatLowered(){return this.cannotHaveStatLowered;}
    public void tickDownCannotHaveStatLowered(){this.cannotHaveStatLowered -= 1;}
    public void setCannotHaveStatLowered(int timer){this.cannotHaveStatLowered = timer;}
    public int getStockpile(){return this.stockpile;}
    public void addToStockpile(){
        if(this.stockpile < 3) {
            this.stockpile += 1;
            System.out.println("Stockpiled to " + Integer.toString(this.stockpile));
        }
        else {
            System.out.println("Stockpiled to 3 already!");
        }
    }
    public void resetStockpile(){this.stockpile = 0;}
    public ArrayList<String> getItemEvolReqs(){return this.itemEvolReqs;}
    public ArrayList<String> getProhibitedMoves(){
        ArrayList<String> currentProhibitedMoves = new ArrayList<>();
        for(CreateOrderedMap<String, Integer> prohib : this.prohibitedMoves){
            currentProhibitedMoves.add(prohib.getKey());
        }
        return currentProhibitedMoves;
    }
    public void setProhibitedMoves(ArrayList<CreateOrderedMap<String, Integer>> prohibitedMoves){
        for(CreateOrderedMap<String, Integer> move : prohibitedMoves){
            this.prohibitedMoves.add(move);
        }
    }

    public void tickDownProhibitedMoves(){
        ArrayList<CreateOrderedMap<String, Integer>> newProhibtedMoves = new ArrayList<>();
        for(CreateOrderedMap<String, Integer> currMoves : this.prohibitedMoves){
            int prohibitedTimer = currMoves.getValue() - 1;
            if(prohibitedTimer > 0){
                newProhibtedMoves.add(new CreateOrderedMap<>(currMoves.getKey(), prohibitedTimer));
            }
        }
        this.prohibitedMoves = newProhibtedMoves;
    }

    private void resetProhibitedMoves(){
        this.prohibitedMoves.clear();
    }

    public Boolean getCannotFlee(){return this.cannotFlee;}
    public void setCannotFlee(){
        if(!this.item.getGarunteesLeave()){
            this.cannotFlee = true;
        }
    }
    public void resetCannotFlee(){
        this.cannotFlee = false;
    }
    public Items getSavedItem(){return this.savedItem;}
    protected void getWildItem(){
        for(CreateOrderedMap<Integer, Items> posItems : this.possibleWildItems){
            this.wildItem.addEntry(posItems.getKey(), posItems.getValue());
        }
        if(!this.wildItem.isEmpty()){
            Items item = this.wildItem.getRandomEntry();
            this.savedItem = item;
            this.item = item;
        }
    }
    public Boolean getHasElectricCharge(){return this.hasElectricCharge;}
    public void  setHasElectricCharge(){
        this.hasElectricCharge = true;
        this.electricChargeTimer = 2;
    }
    public void tickDownHasElectricCharge(){
        this.electricChargeTimer -= 1;
        if(this.electricChargeTimer == 0){
            this.hasElectricCharge = false;
        }
    }
    private void resetHasElectricCharge(){
        this.electricChargeTimer = 0;
        this.hasElectricCharge = false;
    }
    public void setFallAsleep(int sleepTimer){
        this.fallAsleep = true;
        this.fallAsleepTimer = sleepTimer;
    }
    public void tickDownSetFallAsleep(){
        if(this.fallAsleep){
            this.fallAsleepTimer -= 1;
        }
        if(this.fallAsleepTimer == 0){
            this.fallAsleep = false;
            this.Sleep();
        }
    }
    private void resetFallAsleep(){
        this.fallAsleep = false;
        this.fallAsleepTimer = -1;
    }
    public void setFakeLevitateTimer(int timer){
        this.fakeLevitateTimer = timer;
    }
    public void tickDownLevitateTimer(){
        if(this.fakeLevitateTimer > 0){
            this.fakeLevitateTimer -= 1;
            if(this.fakeLevitateTimer <= 0){
                this.fakeLevitates = false;
                System.out.println(this.name + " is no longer levitating");
            }
        }
    }

    public void resetLevitateTimer(){
        this.fakeLevitates = false;
        this.fakeLevitateTimer = 0;
    }

    public Boolean getFakeLevitates(){return this.levitates;}

    public Boolean getLevitates(){return this.levitates;}
    public void setIsFirst(Boolean first){this.isFirst = first;}
    public Boolean getIsFirst(){return this.isFirst;}
    public int getConfuseTimer(){return this.confuseTimer;}
    public void setConfuseTimer(int timer){this.confuseTimer = timer;}
    public void resetConfuseTimer(){this.confuseTimer = 0;}
    public void tickDownConfuseTimer(){this.confuseTimer -= 1;}
    public Boolean getForcedSitOut(){return this.forcedSitOut;}
    public void setForcedSitOut(){this.forcedSitOut = true;}
    public void resetForcedSitOut(){this.forcedSitOut = false;}
    public Boolean getIsOutraged(){return isOutraged;}
    public void setOutrage(){this.isOutraged = true;}
    public void resetOutrage(){this.isOutraged = false;}
    public int getOutrageTimer(){return this.outrageTimer;}
    public void setOutrageTimer(int timer){this.outrageTimer += timer;}
    public void tickDownOutrageTimer(){this.outrageTimer -= 1;}
    public void resetOutrageTimer(){this.outrageTimer = 0;}

    public Boolean getHasSpecWall(){return hasSpecWall;}
    public void setHasSpecWall(int specWallTimer){
        this.hasSpecWall = true;
        this.specWallTimer = specWallTimer;}
    public void resetSpecWall(){
        this.specWallTimer -= 1;
        if(this.specWallTimer == 0){
            System.out.println("Spec Wall ran out of time");
            this.hasSpecWall = false;
        }
    }
    public void breakBarriers(){
        this.specWallTimer = 0;
        this.hasSpecWall = false;
        this.physWallTimer = 0;
        this.hasPhysWall = false;
    }
    public Boolean getIsImprisoned(){return isImprisoned;}
    public void setIsImprisoned(){isImprisoned = true;}
    public void resetIsImprisoned(){isImprisoned = false;}
    public Boolean getHasPhysWall(){return hasPhysWall;}
    public void setHasPhysWall(int physWallTimer){
        this.hasPhysWall = true;
        this.physWallTimer = physWallTimer;}
    public void resetPhysWall(){
        this.physWallTimer -= 1;
        if(this.physWallTimer == 0){
            System.out.println("Phys Wall ran out of time");
            this.hasPhysWall = false;
        }
    }
    public Boolean getCannotUseItems(){return cannotUseItems;}
    public int getNoItemTimer(){return noItemTimer;}
    public void setNoItemTimer(int itemTimer){this.noItemTimer = itemTimer;}
    public void changeNoItemTimer(int itemTimer){this.noItemTimer += itemTimer;}
    public void setCannotUseItems(){this.cannotUseItems = true;}
    public void resetCannotUseItems(){this.cannotUseItems = false;}
    public int getTormentTimer(){return tormentTimer;}
    public void setTormentTimer(int tormentTimer){this.tormentTimer = tormentTimer;}
    public void changeTormentTimer(int tormentTimer){this.tormentTimer += tormentTimer;}
    public Boolean getTormented(){return isTormented;}
    public void setIsTormented(){isTormented = true;}
    public void resetIsTorment(){isTormented = false;}
    public Boolean getTimeEvolReq(){return timeEvolReq;}
    public Boolean getTimeReqdEvol(){return timeReqdEvol;}
    public String getPokeCry(){return pokeCry;}
    public void setPokeCry(String baseName){
        pokeCry =  "C:\\Users\\chris\\IdeaProjects\\PokemonGame" +
                "\\PokemonGame\\src\\SoundEffects\\PokeCries\\" +
                baseName;
    }
    public String getPokeBallType(){return pokeBallType;}
    public void setPokeBallType(String type){this.pokeBallType = type;}
    public Boolean getIsShiny(){return isShiny;}
    public void setIsShiny(Boolean isShiny){
        this.isShiny = isShiny;
    }
    protected void setFullDirName(String graphicName, GlobalVariables globalVariables){
        if(isShiny(globalVariables)){
            this.fullDirName = this.shinyDirName + graphicName;
            this.isShiny = true;
        }
        else{
            this.fullDirName = this.dirName + graphicName;
        }
    }
    protected void setFullDirNameEvolution(Boolean isShiny, String graphicName){
        if(isShiny){
            this.fullDirName = this.shinyDirName + graphicName;
            this.isShiny = true;
        }
        else {
            this.fullDirName = this.dirName + graphicName;
        }
    }
    private Boolean isShiny(GlobalVariables globalVariables) {
        int battleAmount = globalVariables.getBattleCount()[this.ID];
        if(globalVariables.getShinyCheat()){
            return true;
        }
        boolean shinyCharm = globalVariables.getHasShinyCharm();
        int shinyDifficulty = 2048;
        if (shinyCharm) {
            shinyDifficulty = 1024;
        }
        if (battleAmount >= 50) {
            shinyDifficulty = 1366;
            if (shinyCharm) {
                shinyDifficulty = 820;
            }
            if (battleAmount >= 100) {
                shinyDifficulty = 1024;
                if (shinyCharm) {
                    shinyDifficulty = 683;
                }
                if (battleAmount >= 200) {
                    shinyDifficulty = 820;
                    if (shinyCharm) {
                        shinyDifficulty = 586;
                    }
                    if (battleAmount >= 300) {
                        shinyDifficulty = 683;
                        if (shinyCharm) {
                            shinyDifficulty = 512;
                        }
                        if (battleAmount >= 500) {
                            shinyDifficulty = 586;
                            if (shinyCharm) {
                                shinyDifficulty = 456;
                            }
                        }
                    }
                }
            }
        }
        if(new Random().nextInt(shinyDifficulty) == 1){
            return true;
        }
        return false;
    }

    public void setWillCrit(){willCrit = true;}
    public void resetWillCrit(){willCrit = false;}
    public Boolean getWillCrit(){return willCrit;}
    public void setTookDamage(){tookDamage = true;}
    public void resetTookDamage(){tookDamage = false;}
    public Boolean getTookDamage(){return tookDamage;}
    public Boolean getJustThrown(){return justThrown;}
    public void setJustThrown(){justThrown = true;}
    public void resetJustThrown(){justThrown = false;}
    public void setIsCritUp(){isCritUp = true;}
    public void resetIsCritUp(){isCritUp = false;}
    public Boolean getIsCritUp(){return isCritUp;}
    public Boolean getIsAlolan(){return isAlolan;}
    public int showBaseAtt(){return BaseAtt;}
    public Boolean showChargeProtect(){return chargeProtect;}
    public void setChargeProtect(){chargeProtect = true;}
    public void unChargeProtect(){chargeProtect = false;}
    public BaseVortex showVortex(){return vortex;}
    public void resetVortex(){vortex = new NoVortex();}
    public void setVortex(BaseVortex vortex){this.vortex = vortex;}
    public Boolean showVortexMove(){return vortexMove;}
    public void setVortexMove(){vortexMove = true;}
    public void unVortexMove(){vortexMove = false;}
    public Boolean showinVortex(){return inVortex;}
    public void setVortex(){inVortex = true;}
    public void killVortex(){inVortex = false;}
    public Boolean showFlinched(){return isFlinched;}
    public void Flinch(){isFlinched = true;}
    public void unFlinch(){isFlinched = false;}
    public Boolean showIsConfused(){return isConfused;}
    public void Confuse(Pokemon defender){
        isConfused = true;
        if(this.ability.getActivatesOnConfuse()){
            this.ability.doChange(this, defender);
        }
    }
    public void unConfuse(){isConfused = false;}
    public Moves showOnEvol(){return OnEvol;}
    public Boolean showEndures(){return Endures;}
    public void resetEndures(){Endures = false;}
    public void setEndures(){Endures = true;}
    public int showSubstituteHP(){return substituteHP;}
    public void setSubstituteHP(int HP){substituteHP = HP;}
    public void createSubstitute() {
        int SubHealth = (int) Math.round((savedHP / 4.0));
        if ((HP - SubHealth) > 0) {
            substituteHP = SubHealth;
            HP -= SubHealth;
        }
        if ((HP - SubHealth) <= 0) {
            System.out.println(name + " does not have enough health to create a decoy!");
        }
    }
    public void damageSubstitute(int damage){substituteHP -= damage;}
    public void setHP(int setTo){HP = setTo;}
    public Boolean showFloats(){return Floats;}
    public List<Integer> showIVs() {return IV;}
    public List<Integer> showEVs(){return EVs;}
    public int showRawGender(){return Gender;}
    public Boolean showCharged(){return isCharged;}
    public void Charge(){isCharged = true;}
    public void unCharge(){isCharged = false;}
    public Boolean showIsInfatuated(){return isInfatuated;}
    public void Infatuate(){isInfatuated = true;}
    public void unInfatuate(){isInfatuated = false;}
    public void gainProtection(){isProtected = true;}
    public void endProtection(){isProtected = false;}
    public Boolean getIsProtected(){return isProtected;}
    public void setNoStatChange(){noStatChange = true;}
    public Boolean getNoStatChange(){return noStatChange;}
    public void resetNoStatChange(){noStatChange = false;}
    public void setStatChangeTimer(int timerChange){statChangeTimer = timerChange;}
    public void changeStatChangeTimer(int timerChange) {statChangeTimer -= timerChange;}
    public int showStatChangeTimer(){return statChangeTimer;}
    public void setSpecAttTimer(int timerChange){SpecAttTimer = timerChange;}
    public void setPhysAttTimer(int timerChange){PhysAttTimer = timerChange;}
    public void setSpeedTimer(int timerChange){SpeedTimer = timerChange;}
    public void setSpecDefTimer(int timerChange){SpecDefTimer = timerChange;}
    public void setPhysDefTimer(int timerChange){PhysDefTimer = timerChange;}
    public void setEvasTimer(int timerChange){EvasTimer = timerChange;}
    public void setAccTimer(int timerChange){AccTimer = timerChange;}
    public void changeSpecAttTimer(int timerChange){SpecAttTimer += timerChange;}
    public void changePhysAttTimer(int timerChange){PhysAttTimer += timerChange;}
    public void changeSpeedTimer(int timerChange){SpeedTimer += timerChange;}
    public void changeSpecDefTimer(int timerChange){SpecDefTimer += timerChange;}
    public void changePhysDefTimer(int timerChange){PhysDefTimer += timerChange;}
    public void changeEvasTimer(int timerChange){EvasTimer += timerChange;}
    public void changeAccTimer(int timerChange){AccTimer += timerChange;}
    public void changeCritTimer(int timerChange){critTimer += timerChange;}
    public int showSpecAttTimer(){return SpecAttTimer;}
    public int showPhysAttTimer(){return PhysAttTimer;}
    public int showSpeedTimer(){return SpeedTimer;}
    public int showSpecDefTimer(){return SpecDefTimer;}
    public int showPhysDefTimer(){return PhysDefTimer;}
    public int showAccTimer(){return SpecAttTimer;}
    public int showEvasTimer(){return EvasTimer;}
    public int showCritTimer(){return critTimer;}
    public String showPokedexType(){return pokedexType;}
    public Boolean showhasGender(){
        return this.hasGender;
    }
    public String showGender() {
        if (this.Gender == 0) {
            return "Female";
        }
        if (this.Gender == 1) {
            return "Male";
        }
        if(!this.hasGender){
            return "No Gender";
        }
        return null;
    }
    protected void getAbilities(){
        double abilitiy = Math.random();
        if(possibleAbilities.size() == 1){
            ability = possibleAbilities.get(0);
        }
        if(possibleAbilities.size() == 2){
            if(abilitiy > .5){
                ability = possibleAbilities.get(1);
            }
            if(abilitiy <= .5){
                ability = possibleAbilities.get(0);
            }
        }
        if(possibleAbilities.size() == 3){
            if(abilitiy > .6){
                ability = possibleAbilities.get(2);
            }
            if(abilitiy > .3 && abilitiy <= .6){
                ability = possibleAbilities.get(1);
            }
            if(abilitiy <= .3){
                ability = possibleAbilities.get(0);
            }
        }
    }

    public int getCaptureRate(){
        return captureRate;
    }
    public double showWeight(){
        return Weight;
    }
    public Boolean showFrozen(){
        return isFrozen;
    }
    public void Freeze(){
        isFrozen = true;
    }
    public void unFreeze(){
        isFrozen = false;
    }
    public void Sleep(){
        isFrozen = true;
    }
    public void Wake(){
        isFrozen = false;
    }
    public void Paralyze(){
        isParalyzed = true;
    }
    public void unParalyze(){
        isParalyzed = false;
    }
    public void Burn(){
        isBurned = true;
    }
    public void unBurn(){
        isBurned = false;
    }
    public Boolean showAsleep(){
        return isAsleep;
    }
    public Boolean showParalysis(){
        return isParalyzed;
    }
    public Boolean showBurn(){
        return isBurned;
    }
    public Boolean showPoisoned(){
        return isPoisoned;
    }
    public void Poison(){
        isPoisoned = true;
    }
    public void unPoison(){
        isPoisoned = false;
    }
    public Items showItem() {return item;}
    public Pokemon giveItem(Items item, GlobalVariables globalVariables){
        if(!this.itemEvolReqs.isEmpty()){
            if(this.itemEvolReqs.contains(item.showName())){
                return GetPokemon.evolvePoke(globalVariables, this);
            }
        }
        else {
            giveItem(item);
        }
        return this;
    }

    public void giveItem(Items item){
        this.item = item;
        this.savedItem = this.item;
    }
    public Items takeItem(){
        Items taken = this.savedItem;
        this.savedItem = new NoItem();
        this.item = this.savedItem;
        return taken;
    }
    public String showName() {return name; }
    public int showHP() {return HP;}
    public int showSavedHP() {return savedHP;}
    public int showID() {
        return ID;
    }
    public String showType1() {
        return type1;
    }
    public void changeAbilities(Abilities ability){
        this.ability = ability;
    }
    public Boolean showSeeded(){ return  isSeeded;}
    public String showType2() {
        return type2;
    }
    public Abilities showAbility() {
        return ability;
    }

    public List<Moves> showMoves() {
        return moves;
    }

    public List<Moves> showTMmoves() {
        return TMmoves;
    }

    public int showPhysDefense() {
        return PhysDefense;
    }

    public int showPhysAttack() {
        return PhysAttack;
    }

    public int showSpecAttack() {
        return SpecAttack;
    }

    public int showSpecDefense() {
        return SpecDefense;
    }

    public int showLevel() {
        return level;
    }
    public int showBaseSpeed(){return BaseSp;}
    public int showSpeed(int moveSpeed) {
        int returnSpeed;
        double Paralysis = 1;
        if(this.isParalyzed &&
            !this.showAbility().getIgnoresParalysisSpeed()){
            Paralysis = .5;
        }
        returnSpeed = (int) Math.round(this.Speed *
                SpeedDefCalc() * Paralysis *
                moveSpeed);
        return returnSpeed;
    }
    public int showTrueSpeed(){return Speed;}

    public String showNature() {
        return this.nature;
    }

    public double showAccMult() {
        return this.AccMulitplier;
    }

    public double showEvasMult() {
        return this.EvasMulitplier;
    }

    public double showAttMult() {
        return this.AttMultiplier;
    }

    public double showDefMult() {
        return this.DefMulitplier + this.stockpile;
    }

    public double showSpecAttMult() {
        return this.SpecAttMultiplier;
    }

    public double showSpecDefMult() {
        return this.SpecDefMulitplier + this.stockpile;
    }

    public double showSpeedMult() {
        return this.SpeedMultiplier;
    }

    private double SpeedDefCalc(){
        double speedMult = 0;
        if(SpeedMultiplier == 0){speedMult = 1;}
        if(SpeedMultiplier == 1){speedMult = (3.0/2);}
        if(SpeedMultiplier == 2){speedMult = (4.0/2);}
        if (SpeedMultiplier == 3){speedMult = (5.0/2);}
        if(SpeedMultiplier == 4){speedMult = (6.0/2);}
        if(SpeedMultiplier == 5){speedMult = (7.0/2);}
        if(SpeedMultiplier >= 6){speedMult = (8.0/2);}
        if(SpeedMultiplier <= -1){speedMult = (2.0/3);}
        if(SpeedMultiplier == -2){speedMult = (2.0/4);}
        if(SpeedMultiplier == -3){speedMult = (2.0/5);}
        if(SpeedMultiplier == -4){speedMult = (2.0/6);}
        if(SpeedMultiplier == -5){speedMult = (2.0/7);}
        if(SpeedMultiplier == -5){speedMult = (2.0/8);}
        return speedMult;
    }

    public void setTotalEXP() {
        if (!(level == 100)) {
            if (EggGroup.equals("Erratic")) {
                if (level < 50) {
                    totalEXP = (int) Math.round(((level ^ 3) * (100 - level) / 50.0));
                }
                if ((68 > level) && (level >= 50)) {
                    totalEXP = (int) Math.round(((level ^ 3) * (150 - level) / 100.0));
                }
                if ((level >= 68) && (level < 98)) {
                    totalEXP = (int) Math.round((((level ^ 3) * ((1911 - (10 * level) / 3.0))) / 500.0));
                }
                if (level >= 98) {
                    totalEXP = (int) Math.round((((level ^ 3) * (160 - level)) / 100.0));
                }
            }
            if (EggGroup.equals("Fast")) {
                totalEXP = (int) Math.round((((level ^ 3) * 4) / 5.0));
            }
            if (EggGroup.equals("Medium Fast")) {
                totalEXP = level ^ 3;
            }
            if (EggGroup.equals("Medium Slow")) {
                totalEXP = (int) Math.round(((level ^ 3) * (6.0 / 5)) - (15 * (level ^ 2)) + (100 * level) - 140);
            }
            if (EggGroup.equals("Slow")) {
                totalEXP = (int) Math.round(((level ^ 3) * 5.0) / 4);
            }
            if (EggGroup.equals("Fluctuating")) {
                if (level < 15) {
                    totalEXP = (int) Math.round((level ^ 3) * ((((level + 1) / 3.0) + 24) / 50));
                }
                if ((level >= 15) && (level < 36)) {
                    totalEXP = (int) Math.round((level ^ 3) * ((level + 14) / 50.0));
                }
                if (level >= 36) {
                    totalEXP = (int) Math.round((level ^ 3) * (((level / 2.0) + 30) / 50.0));
                }
            }
        }
    }

    public void setNextLevelEXP() {
        int nextlevel = level + 1;
        if (!(nextlevel > 100)) {
            if (EggGroup.equals("Erratic")) {
                if (nextlevel < 50) {
                    NextLevelEXP = (int) Math.round(((nextlevel ^ 3) * (100 - nextlevel) / 50.0));
                }
                if ((68 > nextlevel) && (nextlevel >= 50)) {
                    NextLevelEXP = (int) Math.round(((nextlevel ^ 3) * (150 - nextlevel) / 100.0));
                }
                if ((nextlevel >= 68) && (nextlevel < 98)) {
                    NextLevelEXP = (int) Math.round((((nextlevel ^ 3) * ((1911 - (10 * nextlevel) / 3.0))) / 500.0));
                }
                if (nextlevel >= 98) {
                    NextLevelEXP = (int) Math.round((((nextlevel ^ 3) * (160 - nextlevel)) / 100.0));
                }
            }
            if (EggGroup.equals("Fast")) {
                NextLevelEXP = (int) Math.round((((nextlevel ^ 3) * 4) / 5.0));
            }
            if (EggGroup.equals("Medium Fast")) {
                NextLevelEXP = nextlevel ^ 3;
            }
            if (EggGroup.equals("Medium Slow")) {
                NextLevelEXP = (int) Math.round(((nextlevel ^ 3) * (6.0 / 5)) - (15 * (nextlevel ^ 2)) + (100 * nextlevel) - 140);
            }
            if (EggGroup.equals("Slow")) {
                NextLevelEXP = (int) Math.round(((nextlevel ^ 3) * 5.0) / 4);
            }
            if (EggGroup.equals("Fluctuating")) {
                if (nextlevel < 15) {
                    NextLevelEXP = (int) Math.round((nextlevel ^ 3) * ((((nextlevel + 1) / 3.0) + 24) / 50));
                }
                if ((nextlevel >= 15) && (nextlevel < 36)) {
                    NextLevelEXP = (int) Math.round((nextlevel ^ 3) * ((nextlevel + 14) / 50.0));
                }
                if (nextlevel >= 36) {
                    NextLevelEXP = (int) Math.round((nextlevel ^ 3) * (((nextlevel / 2.0) + 30) / 50.0));
                }
            }
        }
    }
    public void resetAbilities(){
        ability = savedAbility;
    }
    public void setEXPNeeded(){
        EXPNeeded = NextLevelEXP - totalEXP;
    }

    public void changeHP(int Damage) {
        this.HP -= Damage;
        if(Damage > 0){
            this.tookDamage = true;
        }
    }

    public void resetHP() {
        HP = savedHP;
    }
    public void Seed(){
        isSeeded = true;
    }
    public void resetSeed(){
        isSeeded = false;
    }
    public void changeAccMult(double MultChange) {
        AccMulitplier += MultChange;
    }

    public void resetAccMult() {
        AccMulitplier = SavedAccMult;
    }

    public void changeEvasMult(double MultChange) {
        EvasMulitplier += MultChange;
    }

    public void resetEvasMult() {
        EvasMulitplier = SavedEvasMult;
    }

    public void changeAttMult(double MultChange) {
        AttMultiplier += MultChange;
    }

    public void resetAttMult() {
        AttMultiplier = SavedAttMult;
    }

    public void changeDefMult(double MultChange) {
        DefMulitplier += MultChange;
    }

    public void resetDefMult() {
        DefMulitplier = SavedDefMult;
    }

    public void changeSpecAttMult(double MultChange) {
        SpecAttMultiplier += MultChange;
    }

    public void resetSpecAttMult() {
        SpecAttMultiplier = SavedSpecAttMult;
    }

    public void changeSpecDefMult(double MultChange) {
        SpecDefMulitplier += MultChange;
    }

    public void resetSpecDefMult() {
        SpecDefMulitplier = SavedSpecDefMult;
    }

    public void changeSpeedMult(double MultChange) {
        SpeedMultiplier += MultChange;
    }

    public void resetSpeedMult() {
        SpeedMultiplier = SavedSpeedMult;
    }

    public void addFirstMoves() {
        for(int i = 0; i <= level; ++i){
            for(CreateOrderedMap<Integer, Moves> moveMap: learnedMoves){
                if(moveMap.getKey() == i){
                    moves.add(moveMap.getValue());
                }
            }
        }
        while (moves.size() > 4) {
            Random rand = new Random();
            int remove = rand.nextInt(moves.size());
            moves.remove(remove);
        }
    }
    public Boolean LevelUp(String type, Pokemon Defeated){
        double battleType = 1;
        if(type.equals("Trainer")){
            battleType = 1.5;
        }
        int DefeatedEXP = Defeated.onDeathEXP;
        double egg = 1;
        if(item.showName().equals("Lucky Egg")){
            egg = 1.5;
        }
        int Defeatedlevel = Defeated.level;
        double evolEXP = 1;
        if(level>= EvolTiming){
            evolEXP = 1.2;
        }
        int EXPGained = (int) Math.round((((battleType * DefeatedEXP * Defeatedlevel)/5.0) * ((double) (((2 * Defeatedlevel) + 10)/(Defeatedlevel + level + 10)^2)) + 1) * egg * evolEXP);
        System.out.println(name + " gains " + EXPGained + " EXP!");
        CurrentEXP += EXPGained;
        if(CurrentEXP >= EXPNeeded) {
            level += 1;
            changeBaseStats();
            System.out.println("Your " + name + " is now level " + level);
            System.out.println("Defense is now " + PhysDefense);
            System.out.println("Attack is now " + PhysAttack);
            System.out.println("Max HP is now " + savedHP);
            System.out.println("Special Attack is now " + SpecAttack);
            System.out.println("Special Defense is now " + SpecDefense);
            System.out.println("Speed is now " + Speed);
            addMoveonLevel();
            int savedEXP = CurrentEXP - EXPNeeded;
            CurrentEXP = 0;
            setTotalEXP();
            setNextLevelEXP();
            setEXPNeeded();
            EXPNeeded += savedEXP;
            if((level >= EvolTiming) && (!(item.showName().equals("Everstone")))){
                return true;
            }
        }
        return false;
    }

    public void addEVs(Pokemon attacker, Pokemon defender){
        int PhysDefEV = attacker.EVs.get(0);
        if(!(PhysDefEV >= 255)) {
            PhysDefEV += defender.GivesEVs.get(0);
            if (!(PhysDefEV >= 255)) {
                attacker.EVs.remove(0);
                attacker.EVs.add(0, PhysDefEV);
            }
        }
        int PhysAttEV = attacker.EVs.get(1);
        if(!(PhysAttEV >= 255)) {
            PhysAttEV += defender.GivesEVs.get(1);
            if (!(PhysAttEV >= 255)) {
                attacker.EVs.remove(1);
                attacker.EVs.add(1, PhysAttEV);
            }
        }
        int SpecAttEV = attacker.EVs.get(2);
        if(!(SpecAttEV >= 255)) {
            SpecAttEV += defender.GivesEVs.get(2);
            if (!(SpecAttEV >= 255)) {
                attacker.EVs.remove(2);
                attacker.EVs.add(2, SpecAttEV);
            }
        }
        int SpecDefEV = attacker.EVs.get(3);
        if(!(SpecDefEV >= 255)) {
            SpecDefEV += defender.GivesEVs.get(3);
            if (!(SpecDefEV >= 255)) {
                attacker.EVs.remove(3);
                attacker.EVs.add(3, SpecDefEV);
            }
        }
        int SpeedEV = attacker.EVs.get(4);
        if(!(SpeedEV >= 255)) {
            SpeedEV += defender.GivesEVs.get(4);
            if (!(SpeedEV >= 255)) {
                attacker.EVs.remove(4);
                attacker.EVs.add(4, SpeedEV);
            }
        }
        int HPEV = attacker.EVs.get(5);
        if(!(HPEV >= 255)) {
            HPEV += defender.GivesEVs.get(5);
            if (!(HPEV >= 255)) {
                attacker.EVs.remove(5);
                attacker.EVs.add(5, HPEV);
            }
        }
    }

    public void addMoveonLevel() {
        if (!(this.level > this.learnedMoves.get(this.learnedMoves.size() - 1).getKey())) {
            for (CreateOrderedMap<Integer, Moves> moveMap : this.learnedMoves) {
                if (moveMap.getKey() == this.level) {
                    if (!this.moves.contains(moveMap.getValue())) {
                        Moves move = moveMap.getValue();
                        System.out.println("Learning " + move.showName());
                        boolean removeLearned = false;
                        if (this.moves.size() > 4) {
                            Scanner scan = new Scanner(System.in);
                            System.out.println("Your " + this.name + " can only learn 4 moves. Which of these moves would you like to get rid of?");
                            List<String> names = new ArrayList<>();
                            List<String> numbers = new ArrayList<>();
                            int ticker = 1;
                            for (Moves yourmoves : this.moves) {
                                System.out.println(yourmoves.showName() + " [" + ticker + "]");
                                names.add(yourmoves.showName());
                                numbers.add(Integer.toString(ticker));
                                ticker += 1;
                            }
                            String removeMove = scan.nextLine();
                            while (!names.contains(removeMove) && !numbers.contains(removeMove)) {
                                System.out.println("Does not know that move. Remove a move from the list.");
                                System.out.println(names);
                                removeMove = scan.nextLine();
                            }
                            int remove = 0;
                            if (names.contains(removeMove)) {
                                remove = names.indexOf(removeMove);
                            }
                            if (numbers.contains(removeMove)) {
                                remove = numbers.indexOf(removeMove);
                            }
                            if (moves.get(remove).showName().equals(move.showName())) {
                                removeLearned = true;
                            }
                            if (!removeLearned) {
                                System.out.println(name + " has forgotten " + moves.get(remove).showName());
                                System.out.println(name + " has successfully learned " + move.showName());
                            }
                            if (removeLearned) {
                                System.out.println(name + " has not learned " + move.showName());
                            }
                            moves.remove(remove);
                        }
                    }
                }
            }
        }
    }
    public void learnMovefromEvol(){
        moves.add(OnEvol);
        boolean removeLearned = false;
        Scanner scan = new Scanner(System.in);
        if (moves.size() > 4) {
            if (moves.size() > 4) {
                System.out.println("Your " + name + " can only learn 4 moves. Which of these moves would you like to get rid of?");
                List<String> names = new ArrayList<>();
                List<String> numbers = new ArrayList<>();
                int ticker = 1;
                for (Moves yourmoves : moves) {
                    System.out.println(yourmoves.showName() + " [" + ticker + "]");
                    names.add(yourmoves.showName());
                    numbers.add(Integer.toString(ticker));
                    ticker += 1;
                }
                String removeMove = scan.nextLine();
                while (!names.contains(removeMove) && !numbers.contains(removeMove)) {
                    System.out.println("Does not know that move. Remove a move from the list.");
                    removeMove = scan.nextLine();
                }
                int remove = 0;
                if (names.contains(removeMove)) {
                    remove = names.indexOf(removeMove);
                }
                if (numbers.contains(removeMove)) {
                    remove = numbers.indexOf(removeMove);
                }
                if (moves.get(remove).showName().equals(OnEvol.showName())) {
                    removeLearned = true;
                }
                if (!removeLearned) {
                    System.out.println(name + " has forgotten " + moves.get(remove).showName());
                    System.out.println(name + " has successfully learned " + OnEvol.showName());
                }
                if (removeLearned) {
                    System.out.println(name + " has not learned " + OnEvol.showName());
                }
                moves.remove(remove);
            }
        }
    }

    public void addmovefromTM(List<String> TMInventory){
        List<String> CurrentTMs = TMInventory;
        List<String> Movenames = new ArrayList<>();
        List<String> AvailableTMs = new ArrayList<>();
        boolean AcceptableMove = false;
        boolean removeLearned = false;
        for(Moves PotMoves : TMmoves) {
            Movenames.add(PotMoves.showName());
            if (CurrentTMs.contains(PotMoves.showName())) {
                AvailableTMs.add(PotMoves.showName());
                AcceptableMove = true;
            }
        }
        if(AcceptableMove) {
            System.out.println("What TM would you like to use? (Type in moves or back)");
            System.out.println(AvailableTMs);
            Scanner scan = new Scanner(System.in);
            String Selection = scan.nextLine();
            while (!AvailableTMs.contains(Selection) && (!Selection.equals("back"))) {
                System.out.println("That move is not available. ");
                System.out.println("What TM would you like to use? (Type in moves or back)");
                System.out.println(AvailableTMs);
                Selection = scan.nextLine();
            }
            if (Selection.equals("back")) {
                System.out.println("Returning to menu");
            }
            if (AvailableTMs.contains(Selection)) {
                System.out.println("Learning " + Selection);
                for (Moves PotMoves : TMmoves) {
                    if (PotMoves.showName().equals(Selection)) {
                        moves.add(PotMoves);
                        if (moves.size() > 4) {
                            System.out.println("Your " + name + " can only learn 4 moves. Which of these moves would you like to get rid of?");
                            List<String> names = new ArrayList<>();
                            List<String> numbers = new ArrayList<>();
                            int ticker = 1;
                            for (Moves yourmoves : moves) {
                                System.out.println(yourmoves.showName() + " [" + ticker + "]");
                                names.add(yourmoves.showName());
                                numbers.add(Integer.toString(ticker));
                                ticker += 1;
                            }
                            String removeMove = scan.nextLine();
                            while (!names.contains(removeMove) && !numbers.contains(removeMove)) {
                                System.out.println("Does not know that move. Remove a move from the list.");
                                System.out.println(names);
                                removeMove = scan.nextLine();
                            }
                            int remove = 0;
                            if (names.contains(removeMove)) {
                                remove = names.indexOf(removeMove);
                            }
                            if (numbers.contains(removeMove)) {
                                remove = numbers.indexOf(removeMove);
                            }
                            if (moves.get(remove).showName().equals(Selection)) {
                                removeLearned = true;
                            }
                            if (!removeLearned) {
                                System.out.println(name + " has forgotten " + moves.get(remove).showName());
                                System.out.println(name + " has successfully learned " + Selection);
                            }
                            if (removeLearned) {
                                System.out.println(name + " has not learned " + Selection);
                            }
                            moves.remove(remove);
                        }
                    }
                }
            }
        }
        if(!AcceptableMove){
            System.out.println(this.name + " is not able to learn any moves.");
        }
    }
    public void changeBaseStats(){
        double AttNat = 1;
        double SpecAttNat = 1;
        double DefNat = 1;
        double SpecDefNat = 1;
        double SpeedNat = 1;
        if(this.nature.equals("Bold") || this.nature.equals("Adamant") || this.nature.equals("Naughty") || this.nature.equals("Brave")){
            AttNat = 1.1;
        }
        if(this.nature.equals("Hardy") || this.nature.equals("Modest") || this.nature.equals("Calm") || this.nature.equals("Timid")){
            AttNat = .9;
        }
        if(this.nature.equals("Bold") || this.nature.equals("Lax") || this.nature.equals("Gentle") || this.nature.equals("Hasty")){
            DefNat = .9;
        }
        if(this.nature.equals("Hardy") || this.nature.equals("Impish") || this.nature.equals("Lonely") || this.nature.equals("Relaxed")){
            DefNat = 1.1;
        }
        if(this.nature.equals("Adamant") || this.nature.equals("Impish") || this.nature.equals("Mild") || this.nature.equals("Jolly")){
            SpecDefNat = .9;
        }
        if(this.nature.equals("Calm") || this.nature.equals("Gentle") || this.nature.equals("Quirky") || this.nature.equals("Sassy")){
            SpecDefNat = 1.1;
        }
        if(this.nature.equals("Modest") || this.nature.equals("Lax") || this.nature.equals("Mild") || this.nature.equals("Quiet")){
            SpecAttNat = 1.1;
        }
        if(this.nature.equals("Naughty") || this.nature.equals("Lonely") || this.nature.equals("Quirky") || this.nature.equals("Naive")){
            SpecAttNat = .9;
        }
        if(this.nature.equals("Timid") || this.nature.equals("Hasty") || this.nature.equals("Jolly") || this.nature.equals("Naive")){
            SpeedNat = 1.1;
        }
        if(this.nature.equals("Brave") || this.nature.equals("Relaxed") || this.nature.equals("Quiet") || this.nature.equals("Sassy")){
            SpeedNat = .9;
        }
        this.PhysDefense = (int) Math.round(((((2 * this.BaseDef + this.IV.get(0) + (this.EVs.get(0)/4.0)) * this.level)/100.0) + 5) * DefNat);
        this.PhysAttack = (int) Math.round(((((2 * this.BaseAtt + this.IV.get(1) + (this.EVs.get(1)/4.0)) * this.level)/100.0) + 5) * AttNat);
        this.SpecAttack = (int) Math.round(((((2 * this.BaseSpecAtt + this.IV.get(2) + (this.EVs.get(2)/4.0)) * this.level)/100.0) + 5) * SpecAttNat);
        this.SpecDefense = (int) Math.round(((((2 * this.BaseSpecDef + this.IV.get(3) + (this.EVs.get(3)/4.0)) * this.level)/100.0) + 5) * SpecDefNat);
        this.Speed = (int) Math.round(((((2 * this.BaseSp + this.IV.get(4) + (this.EVs.get(4)/4.0)) * this.level)/100.0) + 5) * SpeedNat);
        this.savedHP = (int) Math.round(((((2 * this.BaseHP) + this.IV.get(5) + (this.EVs.get(5)/4.0)) * this.level)/100.0) + this.level + 10);
        this.savedDef = this.PhysDefense;
        this.savedAtt = this.PhysAttack;
        this.savedSpecAtt = this.SpecAttack;
        this.savedSpecDef = this.SpecDefense;
        this.savedSpeed = this.Speed;
    }

    public void visitNurse() {
        resetHP();
        for (Moves moves : showMoves()) {
            moves.resetPP();
        }
        System.out.println(this.name + "'s HP and PP have been reset.");
    }
    public String toString(){
        String fullName = this.name + "\nDex Name: " + this.pokedexType + "\nType: " + this.type1;
        if(!this.type2.equals("")){
            fullName = fullName + " and " + this.type2;
        }
        fullName = fullName + "\nLevel: " + this.level;
        return fullName;
    }
    public String toHTMLString(){
        String fullName ="<html><center>" +  this.name + "<br>Dex Name: " + this.pokedexType + "<br>Type: " + this.type1;
        if(!this.type2.equals("")){
            fullName = fullName + " and " + this.type2;
        }
        fullName = fullName + "<br>Level: " + level;
        return fullName;
    }
    protected void setFirstEVs(){
        Collections.addAll(EVs, 0, 0, 0, 0, 0, 0);
    }

    protected void setGivesEVs(int PhysDef, int PhysAtt, int SpecDef, int SpecAtt, int Speed, int HP){
        Collections.addAll(GivesEVs, PhysDef, PhysAtt, SpecDef, SpecAtt, Speed, HP);
    }
    protected void setBaseStats(int BaseDef, int BaseAtt, int BaseHP, int BaseSpecAtt, int BaseSpecDef, int BaseSp, int ID,
                                int captureRate, double weight, String type1, String eggGroup, int level, int onDeathEXP){
        this.BaseDef = BaseDef;
        this.BaseAtt = BaseAtt;
        this.BaseHP = BaseHP;
        this.BaseSpecAtt = BaseSpecAtt;
        this.BaseSpecDef = BaseSpecDef;
        this.BaseSp = BaseSp;
        this.ID = ID;
        this.captureRate = captureRate;
        this.Weight = weight;
        this.type1 = type1;
        this.EggGroup = eggGroup;
        this.level = level;
        this.onDeathEXP = onDeathEXP;
    }

    public void setNature(){
        nature = NatureChart.NatureType();
    }
    public void setIVs(){
        this.IV = IVDistribution.DistributeIVs();
    }

    public ImageIcon getPokeImage(){
        ImageIcon imageIcon = new ImageIcon(this.fullDirName);
        Image image = imageIcon.getImage();
        Image newImg = image.getScaledInstance(500, 415,  java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(newImg);
    }

    private void resetItem(){
        if(this.item.showName().equals(this.savedItem.showName())){
            if(this.item.getIsConsumable() && this.item.getItemUsed()){
                this.item = new NoItem();
                this.savedItem = new NoItem();
                return;
            }
        this.item = this.savedItem;
        }
    }

    public void resetForWin(){
        this.resetForThrow();
        this.ridStatusEffects();
        this.resetVortex();
        this.resetConfuseTimer();
        this.resetItem();
    }

    public void ridStatusEffects(){
        this.Wake();
        this.unParalyze();
        this.unBurn();
        this.unFreeze();
        this.unPoison();
    }

    public void resetForThrow(){
        this.resetFallAsleep();
        this.resetMults();
        this.resetAbilities();
        this.resetNoStatChange();
        this.resetSeed();
        this.unInfatuate();
        this.unCharge();
        this.resetIsTorment();
        this.breakBarriers();
        this.resetCannotUseItems();
        this.resetIsImprisoned();
        this.setSubstituteHP(0);
        this.resetForcedSitOut();
        this.resetConfuseTimer();
        this.resetWillCrit();
        this.resetLevitateTimer();
        this.resetHasElectricCharge();
        this.resetCannotFlee();
        this.resetProhibitedMoves();
        this.resetCannotHaveStatLowered();
        if(!this.type4.equals("")){
            this.resetType4();
        }
        if(!this.type3.equals("")){
            this.resetType3();
        }
    }

    public void resetMults(){
        this.resetAccMult();
        this.resetAttMult();
        this.resetDefMult();
        this.resetEvasMult();
        this.resetSpecAttMult();
        this.resetSpeedMult();
        this.resetSpecDefMult();
        this.resetAllStats();
    }
    public void resetAllStats(){
        this.setSpeed(this.savedSpeed);
        this.setSpecDef(this.savedSpecDef);
        this.setSpecAtt(this.savedSpecAtt);
        this.setPhysAtt(this.savedAtt);
        this.setPhysDefense(this.savedDef);
    }
    public void setSpeed(int Speed){
        this.Speed = Speed;
    }
    public void setSpecAtt(int SpecAtt){
        this.SpecAttack = SpecAtt;
    }
    public void setSpecDef(int SpecDef){
        this.SpecDefense = SpecDef;
    }
    public void setPhysAtt(int PhysAtt){
        this.PhysAttack = PhysAtt;
    }
    public void setPhysDefense(int physDef){
        this.PhysDefense = physDef;
    }

    protected void PLACEHOLDERFORINTERFACE(){
        this.PLACEHOLDER.getKey();
    }
}
