package BattleMechanics;
import BattleMechanics.Vortex.NoVortex;
import Interfaces.CreateOrderedMap;
import Items.NoItem;
import PlayerMechanics.AreaMechanics;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.E.Empty;
import PokemonCreation.Pokemon;
import Terrain.*;
import Weather.Overcast;
import Weather.Weather;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Moves {
    protected String type;
    protected int power;
    protected int acc;
    protected String name;
    protected int PP;
    protected int savedPP;
    protected Boolean dealsDamage = false;
    protected Boolean DamageSelf = false;
    protected double recoil = 0;
    protected Boolean Healally = false;
    protected Boolean StatchangeEnemy = false;
    protected Boolean StateChangeAlly = false;
    protected Boolean CanMiss = false;
    protected Boolean isSpecial = false;
    protected Boolean affectsAcc = false;
    protected Boolean affectsEv = false;
    protected Boolean affectsSpecAtt = false;
    protected Boolean affectsSpecDef = false;
    protected Boolean affectsPhysAtt = false;
    protected Boolean affectsSpeed = false;
    protected Boolean affectsPhysDef = false;
    protected double MultChange = 0;
    protected double HealAmount = 0;
    protected double ModHealAm =0;
    protected double ModHealAm2 = 0;
    protected String changeTypeName = "";
    protected Boolean canSeed = false;
    protected Boolean affectsCrit = false;
    protected int Critnum = 0;
    protected Boolean canPoison = false;
    protected Boolean canSleep = false;
    protected Boolean canParalyze = false;
    protected Boolean canFreeze = false;
    protected Boolean canBurn = false;
    protected Boolean weatherReq = false;
    protected String ReqdWeather = "";
    protected Boolean weatherReqDown = false;
    protected List<String> ReqdWeatherDown = new ArrayList<>();
    protected Boolean affectsAbilities = false;
    protected Abilities toAbility = new Empty();
    protected Boolean affectsBoth = false;
    protected Boolean reqCharge = false;
    protected int turnLength = 0;
    protected int TMNum = 0;
    protected Boolean onTimer = false;
    protected int timerChange = 0;
    protected Boolean affectsStatChange = false;
    protected Boolean selfSleep = false;
    protected Boolean fullRestore = false;
    protected Boolean canFlinch = false;
    protected int FlinchChance = 0;
    protected Boolean fullDef = false;
    protected Boolean DamBackHeal = false;
    protected double BackHealAm = 0;
    protected Boolean canInfatuate = false;
    protected Boolean weatherChange = false;
    protected Weather toWeather = new Overcast();
    protected Boolean Charge = false;
    protected Boolean MultHit = false;
    protected int MinHit = 0;
    protected int MaxHit = 0;
    protected Boolean terrainChange = false;
    protected Terrain toTerrain = new NormalTerrain();
    protected double paralysisChance = 100;
    protected String paralysisTypeFail = "";
    protected Boolean onlyCanParalyze = false;
    protected double sleepChance = 100;
    protected Boolean onlyCanSleep = false;
    protected Boolean onlyCanBurn = false;
    protected double burnChance = 100;
    protected double poisonChance = 100;
    protected Boolean onlyCanPoison = false;
    protected double freezeChance = 100;
    protected Boolean onlyCanFreeze = false;
    protected boolean makesContact = false;
    protected Boolean ignoreSubstitute = false;
    protected Boolean createsSubstitute = false;
    protected Boolean statChangeReqChance = false;
    protected double StatChangeReq = 100;
    protected Boolean Endures = false;
    protected Boolean forcesSitOut = false;
    protected Boolean Outrage = false;
    protected int OutrageMinTimer = 0;
    protected int OutrageMaxTimer = 0;
    protected Boolean selfConfuse = false;
    protected Boolean createsVortex = false;
    protected BaseVortex vortex = new NoVortex();
    protected Boolean cannotBeAttacked = false;
    protected Boolean enemyResetStats = false;
    protected Boolean allyResetStats = false;
    protected Boolean selfKnockOffItem = false;
    protected Boolean enemyKnockOffItem = false;
    protected Boolean endsVortex = false;
    protected Boolean canConfuse = false;
    protected Boolean canOnlyConfuse = false;
    protected double confuseChance = 100;
    protected Boolean statChange2 = false;
    protected Boolean statChangeEnemy2 = false;
    protected Boolean statChangeAlly2 = false;
    protected double MultChange2 = 0;
    protected Boolean affectsAcc2 = false;
    protected Boolean affectsEv2 = false;
    protected Boolean affectsSpecAtt2 = false;
    protected Boolean affectsSpecDef2 = false;
    protected Boolean affectsPhysAtt2 = false;
    protected Boolean affectsSpeed2 = false;
    protected Boolean affectsPhysDef2 = false;
    protected String changeTypeName2 = "";
    protected Boolean usesBerry = false;
    protected Boolean whirlwindEffect = false;
    protected Boolean vortexSelf = false;
    protected Boolean takeItem = false;
    protected Boolean selfWhirlwindEffect = false;
    protected Boolean batonPass = false;
    protected Boolean abilitySwap = false;
    protected Boolean healOrDamage = false;
    protected Boolean goesFirst = false;
    protected Boolean critUp = false;
    protected Boolean garaunteeCrit = false;
    protected boolean cutsHPTo = false;
    protected double cutHPBy = 0;
    protected Boolean causesOutrage = false;
    protected int outrageTimer = 0;
    protected Boolean causesTorment = false;
    protected int tormentTimer = 0;
    protected Boolean causesNoItem = false;
    protected int noItemTimer = 0;
    protected Boolean doesEnemyMove = false;
    protected double poweredUp = 1;
    protected Boolean createsPhysWall = false;
    protected int physWallTimer = 0;
    protected Boolean requiresSleep = false;
    protected Boolean createsImprison = false;
    protected Boolean usesSpentItem = false;
    protected Boolean copiesStatChanges = false;
    protected Boolean createsSpecWall = false;
    protected int specWallTimer = 0;
    protected Boolean breaksBarriers = false;
    protected Boolean dealsFutureDamage = false;
    protected int timeToFutureDamage = 0;
    protected int speedPriority = 1;
    protected Boolean websGround = false;
    protected Boolean needsKnockOut = false;
    protected Boolean spikesGround = false;
    protected Boolean toxicSpikesGround = false;
    protected Boolean causesLevitate = false;
    protected int levitateTimer = 0;
    protected Boolean futureFallAsleep = false;
    protected int futureFallAsleepTimer = 0;
    protected Boolean causesEnemyOutrage = false;
    protected int enemyOutrageTimer = 0;
    protected Boolean chargesElectric = false;
    protected Boolean giveEnemyAbility = false;
    protected ArrayList<CreateOrderedMap<String, Integer>> prohibitsMoves = new ArrayList<>();
    protected Boolean ridsStatusEffects = false;
    protected int protectsFromStatChanges = 0;
    protected Boolean causesNoMiss = false;
    protected int createsTrickRoom = 0;
    protected Boolean swapPower = false;
    protected Boolean swapPhysAtt = false;
    protected Boolean swapSpecAtt = false;
    protected Boolean swapPhysDef = false;
    protected Boolean swapSpecDef = false;
    protected Boolean swapSpeed = false;
    protected Boolean retaliatingMove = false;
    protected String resetsTypeTo = "";
    protected String resetsTypeFrom = "";
    protected Boolean resetsType = false;
    protected Boolean setsHPTo0PostStatChange = false;
    protected Boolean causesCannotFlee = false;
    protected double addsToHP = 0;
    protected int usesPerBattle = -1;
    protected int usesPerBattleSaved = this.usesPerBattle;
    protected int isDisabled = 0;
    protected int causesDisabled = 0;
    protected int magicRoomAdd = 0;
    protected int coins = 0;
    protected int createsWonderRoom = 0;

    public int getCoins(){
        int batCoins = this.coins;
        this.coins = 0;
        return batCoins;
    }

    public Moves resolveMetronome(){return this;}
    public int getCreatesWonderRoom(){return this.createsWonderRoom;}
    public int getMagicRoomAdd(){return this.magicRoomAdd;}
    public int getCausesDisabled(){return this.causesDisabled;}
    public void setIsDisabled(int disableTimer){this.isDisabled = disableTimer;}
    public void tickDownDisabledTimer(){this.isDisabled -= 1;}
    public int getIsDisabled(){return this.isDisabled;}
    public int getUsesPerBattle(){return this.usesPerBattle;}
    public double getAddsToHP(){return this.addsToHP;}
    public Boolean getCausesCannotFlee(){return this.causesCannotFlee;}
    public Boolean getResetsType(){return this.resetsType;}
    public String getResetsTypeTo(){return this.resetsTypeTo;}
    public String getResetsTypeFrom(){return this.resetsTypeFrom;}
    public Boolean getSwapPower(){return this.swapPower;}
    public double getMultChange(){return this.MultChange;}
    public int getCreatesTrickRoom(){return this.createsTrickRoom;}
    public Boolean getCausesNoMiss(){return this.causesNoMiss;}
    public int getProtectsFromStatChanges(){return this.protectsFromStatChanges;}
    public Boolean getRidsStatusEffects(){return this.ridsStatusEffects;}
    public void setFlinchChance(int chance){this.FlinchChance = chance;}
    public void resetFlinchChance(){this.FlinchChance = 0;}
    public ArrayList<CreateOrderedMap<String, Integer>> getProhibitsMoves(){return this.prohibitsMoves;}
    public Boolean getGiveEnemyAbility(){return this.giveEnemyAbility;}
    public Boolean getChargesElectric(){return this.chargesElectric;}
    public Boolean getCausesEnemyOutrage(){return this.causesEnemyOutrage;}
    public int getEnemyOutrageTimer(){return this.enemyOutrageTimer;}
    public Boolean getFutureFallAsleep(){return this.futureFallAsleep;}
    public int getFutureFallAsleepTimer(){return this.futureFallAsleepTimer;}
    public int getLevitateTimer(){return this.levitateTimer;}
    public Boolean getCausesLevitate(){return this.causesLevitate;}
    public Boolean getToxicSpikesGround(){return this.toxicSpikesGround;}
    public Boolean getSpikesGround(){return this.spikesGround;}
    public Boolean getNeedsKnockOut(){return this.needsKnockOut;}
    public Boolean getWebsGround(){return websGround;}
    public int getSpeedPriority(){return speedPriority;}
    public Boolean getIsSpecial(){return isSpecial;}
    public Boolean getDealsFutureDamage(){return dealsFutureDamage;}
    public int getTimeToFutureDamage(){return timeToFutureDamage;}
    public Boolean getBreaksBarriers(){return breaksBarriers;}
    public Boolean getCreatesSpecWall(){return createsSpecWall;}
    public int getSpecWallTimer(){return specWallTimer;}
    public Boolean getCopiesStatChanges(){return copiesStatChanges;}
    public Boolean getUsesSpentItem(){return usesSpentItem;}
    public Boolean getCreatesImprison(){return createsImprison;}
    public Boolean getRequiresSleep(){return requiresSleep;}
    public Boolean getCreatesPhysWall(){return createsPhysWall;}
    public int getPhysWallTimer(){return physWallTimer;}
    public int getPower(){return power;}
    public void changePower(double poweredUp){power = (int) poweredUp * power;}
    public double getPoweredUp(){return poweredUp;}
    public Boolean getDoesEnemyMove(){return doesEnemyMove;}
    public Boolean getCausesNoItem(){return causesNoItem;}
    public int getNoItemTimer(){return noItemTimer;}
    public int getTormentTimer(){return tormentTimer;}
    public Boolean getCausesTorment(){return causesTorment;}
    public void setAccuracy(int newAcc){acc = newAcc;}
    public int getOutrageTimer(){return outrageTimer;}
    public Boolean getCausesOutrage(){return causesOutrage;}
    public Boolean getCutsHPTo(){return cutsHPTo;}
    public double getCutHPBy(){return cutHPBy;}
    public Boolean getGaraunteeCrit(){return garaunteeCrit;}
    public Boolean getCritUp(){return critUp;}
    public Boolean getGoesFirst(){return goesFirst;}
    public Boolean showHealOrDamage(){return healOrDamage; }
    public Boolean showAbilitySwap(){return abilitySwap;}
    public Boolean showBatonPass(){return batonPass;}
    public Boolean showSelfWhirlwindEffect(){return selfWhirlwindEffect;}
    public Boolean showTakeItem(){return takeItem;}
    public Boolean showVortexSelf(){return vortexSelf;}
    public Boolean showWhirlwindEffect(){return whirlwindEffect;}
    public Boolean showUsesBerry(){return usesBerry;}
    public Boolean showCanConfuse(){return canConfuse;}
    public Boolean showCanOnlyConfuse(){return canOnlyConfuse;}
    public double showConfuseChance(){return confuseChance;}
    public Boolean showEndsVortex(){return endsVortex;}
    public Boolean showSelfKnockOffItem(){return selfKnockOffItem;}
    public Boolean showEnemyKnockOffItem(){return enemyKnockOffItem;}
    public Boolean showEnemyResetStats(){return enemyResetStats;}
    public Boolean showAllyResetStats(){return allyResetStats;}
    public Boolean showStatChangeAlly(){return StateChangeAlly;}
    public Boolean showCannotBeAttacked(){return cannotBeAttacked;}
    public BaseVortex showVortex(){return vortex;}
    public Boolean showCreatesVortex(){return createsVortex;}
    public Boolean showSelfConfuse(){return selfConfuse;}
    public Boolean showOutrage(){return Outrage;}
    public int showOutrageMinTimer(){return OutrageMinTimer;}
    public int showOutrageMaxTimer(){return OutrageMaxTimer;}
    public Boolean showForcesSitOut(){return forcesSitOut;}
    public Boolean showEndures(){return Endures;}
    public Boolean showStatChangeReqChance(){return statChangeReqChance;}
    public double showStatChangeReq(){return StatChangeReq;}
    public Boolean showCreatesSubstitute(){return createsSubstitute;}
    public Boolean showStatChangeEnemy(){return StatchangeEnemy;}
    public Boolean showIgnoreSubstitute(){return ignoreSubstitute;}
    public Boolean showMakesContact(){return makesContact;}
    public Boolean showOnlyCanFreeze(){return onlyCanFreeze;}
    public double getFreezeChance(){return freezeChance;}
    public Boolean showOnlyCanPoison(){return onlyCanPoison;}
    public double showPoisonChance(){return poisonChance;}
    public Boolean showOnlyCanBurn(){return onlyCanBurn;}
    public double showBurnChance(){return burnChance;}
    public double showSleepChance(){return sleepChance;}
    public Boolean showOnlyCanSleep(){return onlyCanSleep;}
    public double getParalysisChance(){return paralysisChance;}
    public String getParalysisTypeFail(){return paralysisTypeFail;}
    public Boolean showTerrainChange(){return terrainChange;}
    public Terrain getToTerrain(){return toTerrain;}
    public Boolean showCharge() {return Charge;}
    public Boolean showWeatherChange() {return weatherChange;}
    public Weather showToWeather(){return toWeather;}
    public Boolean showCanInfatuate(){return canInfatuate;}
    public Boolean showDamBackHeal(){return DamBackHeal;}
    public double showBackHealAm(){return BackHealAm;}
    public Boolean showFullDef(){return fullDef;}
    public Boolean showCanFlinch(){return canFlinch;}
    public int showFlinchChance(){return FlinchChance;}
    public Boolean showSelfSleep(){return selfSleep;}
    public Boolean showFullRestore(){return fullRestore;}
    public Boolean showAffectsEnemy(){return StatchangeEnemy;}
    public Boolean getAffectsStatChange(){return affectsStatChange;}
    public Boolean showreqCharge (){return reqCharge;}
    public int getTurnLength(){ return turnLength;}
    public Boolean showaffectsBoth() {return  affectsBoth;}
    public Boolean showaffectsAbilities(){return affectsAbilities;}
    public Abilities showtoAbility() {return toAbility;}
    public Boolean showcanSleep(){return canSleep;}
    public Boolean showcanParalyze(){return canParalyze;}
    public Boolean getOnlyCanParalyze(){return onlyCanParalyze;}
    public Boolean showcanFreeze(){return canFreeze;}
    public Boolean showcanBurn(){return canBurn;}
    public Boolean showSelfDamage(){
        return DamageSelf;
    }
    public Boolean showcanSeed(){
        return canSeed;
    }
    public Boolean showcanPoison(){
        return canPoison;
    }
    public Boolean showcanMiss(){
        return CanMiss;
    }
    public Boolean showHeal(){
        if(this.Healally){
            return true;
        }
        return false;
    }
    public Boolean showStatChange(){
        if ((this.StatchangeEnemy) || (this.StateChangeAlly)) {
            return true;
        }
        return false;
    }
    public void createPower(int power){}
    public int showTimerChange() {return timerChange;}
    public String showName(){return name;}
    public int showPP(){return PP;}
    public String showType(){return type;}
    public void showHealAm(Weather weather, Pokemon attacker){
        if(this.name.equals("Swallow")){
            if(attacker.getStockpile() == 0){
                this.HealAmount = 0.0;
            }
            if(attacker.getStockpile() == 1){
                this.HealAmount = 1/4.0;
            }
            if(attacker.getStockpile() == 2){
                this.HealAmount = 1/2.0;
            }
            if(attacker.getStockpile() == 3){
                this.HealAmount = 1.0;
            }
            attacker.resetStockpile();
        }
        double fullHeal = this.HealAmount * attacker.showSavedHP() * attacker.showAbility().HealHelp();
        if(this.weatherReq){
            if(this.ReqdWeather.equals(weather.showName()));
                fullHeal = this.ModHealAm * attacker.showAbility().HealHelp() * attacker.showSavedHP();
        }
        if(this.weatherReqDown) {
            for (String Weather : this.ReqdWeatherDown) {
                if (Weather.equals(weather.showName())) {
                    fullHeal = this.ModHealAm2 * attacker.showAbility().HealHelp() * attacker.showSavedHP();
                }
            }
        }
        int Heal = (int) Math.round(fullHeal);
        if(Heal + attacker.showHP() > attacker.showSavedHP()){
            Heal = attacker.showSavedHP() - attacker.showHP();
        }
        attacker.changeHP(-1 * Heal);}

    public void changePP(Pokemon defender){
        if(defender.showAbility().showName().equals("Pressure")){
            this.PP -= 2;
        }
        else{
            this.PP -= 1;
        }
        if(this.usesPerBattle > 0){
            this.usesPerBattle -= 1;
        }
    }
    public void StatusAffectsPPChange(){
        this.PP += 1;
    }

    public int selfDamage(int DamageDealt){
        return (int) Math.round(this.recoil * DamageDealt);
    }

    public Boolean Hits(Pokemon attacker, Pokemon defender, Pokemon PlayerPoke, Weather weather) {
        Boolean hit = true;
        if(attacker.getCannotMiss()){
            attacker.resetCannotMiss();
            return true;
        }
        if (this.CanMiss){
            if(this.name.equals("Thunder")){
                if(weather.showName().equals("Rain")){
                    setAccuracy(100);
                }
                if(weather.showName().equals("Sunshine")){
                    setAccuracy(50);
                }
                else {
                    setAccuracy(70);
                }
            }
            int randomupper = 100;
            int R = new Random().nextInt(randomupper);
            int TotalAccAttDef = (int) Math.round(attacker.showAccMult());
            if(!attacker.showAbility().getIgnoresEvas()){
                TotalAccAttDef -= defender.showEvasMult() +
                    defender.showAbility().getStatMults(defender, attacker, this, weather)[6] +
                    defender.showItem().getStatMults()[6];
            }
            double TotalAcc = 0;
            if(TotalAccAttDef == 0){TotalAcc = 1;}
            if(TotalAccAttDef == 1){TotalAcc = (4.0/3);}
            if(TotalAccAttDef == 2){TotalAcc = (5.0/3);}
            if (TotalAccAttDef == 3){TotalAcc = (6.0/3);}
            if(TotalAccAttDef == 4){TotalAcc = (7.0/3);}
            if(TotalAccAttDef == 5){TotalAcc = (8.0/3);}
            if(TotalAccAttDef >= 6){TotalAcc = (9.0/3);}
            if(TotalAccAttDef == -1){TotalAcc = (3.0/4);}
            if(TotalAccAttDef == -2){TotalAcc = (3.0/5);}
            if(TotalAccAttDef == -3){TotalAcc = (3.0/6);}
            if(TotalAccAttDef == -4){TotalAcc = (3.0/7);}
            if(TotalAccAttDef == -5){TotalAcc = (3.0/8);}
            if(TotalAccAttDef <= -6){TotalAcc = (3.0/9);}
            TotalAcc = TotalAcc * this.acc;
            TotalAcc = TotalAcc * attacker.showAbility().getStatMults(attacker, defender, this, weather)[5] *
                    attacker.showItem().getStatMults()[5];
            if (TotalAcc >= R) {
                hit = true;
                if (attacker == PlayerPoke) {
                    System.out.println("Your " + attacker.showName() + "'s " + name + " Hit!");
                }
                if (!(attacker == PlayerPoke)) {
                    System.out.println("Enemy " + attacker.showName() + "'s " + name + " Hit!");
                }
            }
            if (TotalAcc < R) {
                hit = false;
                if (attacker == PlayerPoke) {
                    System.out.println("Your " + attacker.showName() + "'s " + name + " Missed!");
                }
                if (!(attacker == PlayerPoke)) {
                    System.out.println("Your " + attacker.showName() + "'s " + name + " Missed!");
                }
            }
        return hit;}
    return null;}

    public Boolean isCrit(Pokemon attacker) {
        int CritStage = 0;
        if(attacker.getIsCritUp()){
            CritStage += 1;
        }
        int Critlev = 0;
        if (attacker.showItem().decideCrit()){
            CritStage += attacker.showItem().showCritChange(attacker);}
        if (this.affectsCrit){
            CritStage += this.Critnum;}
        if(attacker.showAbility().getAffectsCrit()){
            CritStage += attacker.showAbility().getCritNum();
        }
        if (CritStage == 0) {
            Critlev = new Random().nextInt(16);}
        if (CritStage == 1) {
            Critlev = new Random().nextInt(8);}
        if (CritStage == 2) {
            Critlev = new Random().nextInt(4);}
        if (CritStage == 3) {
            Critlev = new Random().nextInt(2);}
        if (CritStage >= 4) {
            Critlev = 1;}
        if (Critlev == 1 ) {
            attacker.addToCritTotal();
            return true;}
        else {
            return false;}
    }

    public float STABBonus(Pokemon attacker){
        float STABTotal;
        STABTotal = 1;
        if ((attacker.showType1().equals(this.type))
                || (attacker.showType2().equals(this.type))){
            STABTotal += .5;
        }
        if (attacker.showAbility().showName().equals("Adaptability")){
            if ((attacker.showType1().equals(this.type))
                    || (attacker.showType2().equals(this.type))){
                STABTotal = 2;
            }
        }
        return STABTotal;
    }

    private double CalcSubtractor(){
        return (Math.random() * (1 - .85) + .85);
    }

    private double AttackCalc(Pokemon attacker){
        double attMult = 0;
        if(attacker.showAttMult() == 0){attMult = 1;}
        if(attacker.showAttMult() == 1){attMult = (4.0/3);}
        if(attacker.showAttMult() == 2){attMult = (5.0/3);}
        if (attacker.showAttMult() == 3){attMult = (6.0/3);}
        if(attacker.showAttMult() == 4){attMult = (7.0/3);}
        if(attacker.showAttMult() == 5){attMult = (8.0/3);}
        if(attacker.showAttMult() >= 6){attMult = (9.0/3);}
        if(attacker.showAttMult() == -1){attMult = (3.0/4);}
        if(attacker.showAttMult() == -2){attMult = (3.0/5);}
        if(attacker.showAttMult() == -3){attMult = (3.0/6);}
        if(attacker.showAttMult() == -4){attMult = (3.0/7);}
        if(attacker.showAttMult() == -5){attMult = (3.0/8);}
        if(attacker.showAttMult() <= -6){attMult = (3.0/9);}
        return attMult;
        }

    private double SpecAttackCalc(Pokemon attacker){
        double attMult = 0;
        if(attacker.showSpecAttMult() == 0){attMult = 1;}
        if(attacker.showSpecAttMult() == 1){attMult = (3.0/2);}
        if(attacker.showSpecAttMult() == 2){attMult = (4.0/2);}
        if (attacker.showSpecAttMult() == 3){attMult = (5.0/2);}
        if(attacker.showSpecAttMult() == 4){attMult = (6.0/2);}
        if(attacker.showSpecAttMult() == 5){attMult = (7.0/2);}
        if(attacker.showSpecAttMult() >= 6){attMult = (8.0/2);}
        if(attacker.showSpecAttMult() == -1){attMult = (2.0/3);}
        if(attacker.showSpecAttMult() == -2){attMult = (2.0/4);}
        if(attacker.showSpecAttMult() == -3){attMult = (2.0/5);}
        if(attacker.showSpecAttMult() == -4){attMult = (2.0/6);}
        if(attacker.showSpecAttMult() == -5){attMult = (2.0/7);}
        if(attacker.showSpecAttMult() <= -6){attMult = (2.0/8);}
        return attMult;
    }

    private double DefCalc(Pokemon defender){
        double defMult = 0;
        if(defender.showDefMult() == 0){defMult = 1;}
        if(defender.showDefMult() == 1){defMult = (3.0/2);}
        if(defender.showDefMult() == 2){defMult = (4.0/2);}
        if (defender.showDefMult() == 3){defMult = (5.0/2);}
        if(defender.showDefMult() == 4){defMult = (6.0/2);}
        if(defender.showDefMult() == 5){defMult = (7.0/2);}
        if(defender.showDefMult() >= 6){defMult = (8.0/2);}
        if(defender.showDefMult() <= -1){defMult = (2.0/3);}
        if(defender.showDefMult() == -2){defMult = (2.0/4);}
        if(defender.showDefMult() == -3){defMult = (2.0/5);}
        if(defender.showDefMult() == -4){defMult = (2.0/6);}
        if(defender.showDefMult() == -5){defMult = (2.0/7);}
        if(defender.showDefMult() == -6){defMult = (2.0/8);}
        return defMult;
    }

    private double SpecDefCalc(Pokemon defender){
        double defMult = 0;
        if(defender.showSpecDefMult() == 0){defMult = 1;}
        if(defender.showSpecDefMult() == 1){defMult = (3.0/2);}
        if(defender.showSpecDefMult() == 2){defMult = (4.0/2);}
        if (defender.showSpecDefMult() == 3){defMult = (5.0/2);}
        if(defender.showSpecDefMult() == 4){defMult = (6.0/2);}
        if(defender.showSpecDefMult() == 5){defMult = (7.0/2);}
        if(defender.showSpecDefMult() >= 6){defMult = (8.0/2);}
        if(defender.showSpecDefMult() <= -1){defMult = (2.0/3);}
        if(defender.showSpecDefMult() == -2){defMult = (2.0/4);}
        if(defender.showSpecDefMult() == -3){defMult = (2.0/5);}
        if(defender.showSpecDefMult() == -4){defMult = (2.0/6);}
        if(defender.showSpecDefMult() == -5){defMult = (2.0/7);}
        if(defender.showSpecDefMult() == -5){defMult = (2.0/8);}
        return defMult;
    }

    public int damageDealt(Pokemon attacker, Pokemon defender,
                           Weather weather, Terrain terrain,
                           List<Pokemon> Waiting, Moves enemyMove,
                           Boolean isFirst, Boolean magicRoom,
                           Boolean wonderRoom){
        int RefinedDamage;
        double RawDamage = 0;
        int savedRefinedDamage = 0;
        if(defender.getHasQuickGaurd()){
            defender.resetHasQuickGuard();
            if(this.goesFirst){
                return 0;
            }
        }
        //RESOLVE ABILITIES
        double fromAbility = attacker.showAbility().affectedOnDamage(this);
        attacker.showAbility().addStageDuringDamage(attacker,
                defender, this, weather,true, isFirst);
        defender.showAbility().addStageDuringDamage(attacker,
                defender, this, weather,false, isFirst);
        Boolean isUsed = defender.showItem().getStatMultsDuringDamage(this,
                defender, magicRoom);
        if(isUsed && defender.showItem().getIsConsumable()){
            defender.giveItem(new NoItem());
        }
        if(this.name.equals("Weather Ball")){
            if(weather.showName().equals("Sunny")){
                this.type = "Fire";
            }
            if(weather.showName().equals("Heavy Rain")){
                this.type = "Water";
            }
            if(weather.showName().equals("Hail")){
                this.type = "Ice";
            }
            if(weather.showName().equals("Sandstorm")){
                this.type = "Rock";
            }
        }
        if(this.name.equals("Grass Knot") || this.name.equals("Low Kick")){
            if(defender.showWeight() < 22){
                this.power = 20;
            }
            if(defender.showWeight() >= 22){
                this.power = 40;
            }
            if(defender.showWeight() >= 55){
                this.power = 60;
            }
            if(defender.showWeight() >= 110){
                this.power = 80;
            }
            if(defender.showWeight() >= 220){
                this.power = 100;
            }
            if(defender.showWeight() >= 440){
                this.power = 120;
            }
        }
        if(this.retaliatingMove){
            this.createPower(attacker.getPreviousDamage());
        }
        if(this.name.equals("Heavy Slam")){
            double weightPerc = defender.showWeight()/attacker.showWeight();
            if(weightPerc <= .2){
                this.power = 120;
            }
            else if(weightPerc <= .25){
                this.power = 100;
            }
            else if(weightPerc <= .33){
                this.power = 80;
            }
            else if(weightPerc <= .5){
                this.power = 60;
            }
            else {
                this.power = 40;
            }
        }
        if(this.name.equals("Beat Up")){
            for(Pokemon pokemon : Waiting){
                RawDamage += Math.round(pokemon.showBaseAtt()/10.0) + 5;
            }
        }
        if(this.name.equals("Fling")){
            this.power = attacker.showItem().showFlingDamage();
            attacker.showItem().useBerry(defender, false, defender.showAbility().showName());
        }
        if(this.name.equals("Gyro Ball")){
            this.power = 25 * (defender.showSpeed(
                    enemyMove.getSpeedPriority()) /
                    attacker.showSpeed(this.speedPriority));
        }
        if(this.name.equals("Heat Crash")){
            double weightPerc = defender.showWeight()/
                    attacker.showWeight();
            if(weightPerc >= .5){
                this.power = 40;
            }
            if(weightPerc < .5){
                this.power = 60;
            }
            if(weightPerc < .33){
                this.power = 80;
            }
            if(weightPerc < .25){
                this.power = 100;
            }
            if(weightPerc < .20){
                this.power = 120;
            }
        }
        if(this.name.equals("Frustration")){
            this.power = (int) Math.floor((
                    attacker.showSavedHP() -
                            (attacker.showSavedHP() -
                                    attacker.showHP()))/1.5);
        }
        if(this.name.equals("Return")){
            this.power = (int) (Math.floor(
                    (((double) attacker.showHP())/
                            attacker.showSavedHP()) * 120));
        }
        if(this.name.equals("Reversal") || this.name.equals("Flail")){
            double HPPerc = ((double) attacker.showHP()/attacker.showSavedHP()) * 100;
            if(this.name.equals("Reversal")) {
                if (HPPerc >= 67.16) {
                    this.power = 20;
                } else if (HPPerc >= 34.38) {
                    this.power = 40;
                } else if (HPPerc >= 20.31) {
                    this.power = 80;
                } else if (HPPerc >= 9.38) {
                    this.power = 100;
                } else if (HPPerc >= 3.13) {
                    this.power = 150;
                } else {
                    this.power = 200;
                }
            }
            if(this.name.equals("Flail")){
                if (HPPerc >= 68.75) {
                    this.power = 20;
                } else if (HPPerc >= 35.42) {
                    this.power = 40;
                } else if (HPPerc >= 20.83) {
                    this.power = 80;
                } else if (HPPerc >= 10.42) {
                    this.power = 100;
                } else if (HPPerc >= 4.17) {
                    this.power = 150;
                } else {
                    this.power = 200;
                }
            }
        }
        if(this.name.equals("Stored Power")){
            this.power = 20;
            double increases = attacker.showAccMult()
                    + attacker.showDefMult() + attacker.showEvasMult()
                    + attacker.showSpeedMult() + attacker.showSpecAttMult()
                    + attacker.showSpecDefMult();
            this.power += (int) (20 * increases);
        }
        if(this.name.equals("Night Shade")){
            this.power = attacker.showLevel();
        }
        if(this.name.equals("Final Gambit")){
            this.power = attacker.showHP();
        }
        if(this.name.equals("Electro Ball")){
            double targetSpeedPerc = (double) defender.showSpeed(1)/attacker.showSpeed(1);
            if(targetSpeedPerc > .5){
                this.power = 60;
            }
            else if(targetSpeedPerc > .33){
                this.power = 80;
            }
            else if(targetSpeedPerc > .25){
                this.power = 120;
            }
            else{
                this.power = 150;
            }
        }
        if(this.name.equals("Spit Up")){
            if(attacker.getStockpile() == 0){
                this.power = 1;
            }
            if(attacker.getStockpile() == 1){
                this.power = 100;
            }
            if(attacker.getStockpile() == 2){
                this.power = 200;
            }
            if(attacker.getStockpile() == 3){
                this.power = 300;
            }
            attacker.resetStockpile();
        }
        if(!defender.getIsProtected()){
            if(this.name.equals("Sheer Cold")){
                if(!defender.showType1().equals("Ice") &&
                        !defender.showType2().equals("Ice")){
                    double rand = new Random().nextInt(100);
                    int chanceHelp = 20;
                    if(attacker.showType1().equals("Ice") ||
                    attacker.showType2().equals("Ice")){
                        chanceHelp = 30;
                    }
                    if(rand < (attacker.showLevel() - defender.showLevel() + chanceHelp)){
                        return (defender.showHP());
                    }
                }
                else {
                    return 0;
                }
            }
            if (this.cutsHPTo) {
                if(this.name.equals("Endeavor")){
                    savedRefinedDamage = defender.showHP() - attacker.showHP();
                }
                else {
                    savedRefinedDamage = (int) Math.ceil(defender.showHP() / this.cutHPBy);
                }
            } else {
                int hitTimes = 1;
                int hitTicker = 1;
                if (this.MultHit) {
                    if(attacker.showAbility().showName().equals("Skill Link")){
                        hitTimes = 5;
                    }
                    else {
                        int range = this.MaxHit - this.MinHit + 1;
                        hitTimes = (int) Math.round((Math.random() * range) + this.MinHit);
                    }
                }
                while (hitTicker <= hitTimes) {
                    double attack = 0;
                    double defense = 0;
                    if (this.isSpecial) {
                        attack = getSpecAttack(attacker, defender, weather);
                        if(this.name.equals("Psyshock") || this.name.equals("Psystrike")){
                            if(wonderRoom){
                                defense = getSpecDef(attacker, defender, weather);
                            }
                            else {
                                defense = getPhysDef(attacker, defender, weather);
                            }
                        }
                        else {
                            if(wonderRoom){
                                defense = getPhysDef(attacker, defender, weather);
                            }
                            else {
                                defense = getSpecDef(attacker, defender, weather);
                            }
                        }
                        if(defender.getHasSpecWall()){
                            defense = defense*2;
                        }
                    }
                    if (!this.isSpecial) {
                        if(wonderRoom){
                            defense = getSpecDef(attacker, defender, weather);
                        }
                        else {
                            defense = getPhysDef(attacker, defender, weather);
                        }
                        if(defender.getHasPhysWall()){
                            defense = defense * 2;
                        }
                        if(this.name.equals("Foul Play")){
                            attack = getAttackFoulPlay(attacker, defender, weather);
                        }
                        else if(this.name.equals("Body Press")){
                            attack = getAttackBodyPress(attacker, defender, weather);
                        }
                        else {
                            attack = getPhysAttack(attacker, defender, weather);
                        }
                    }
                    RawDamage = attack / defense;
                    if ((this.name.equals("Acrobatics") && attacker.showItem().showName().equals(""))
                    || ((this.name.equals("Brine")) && (defender.showHP() * 1.0)/defender.showSavedHP() <= .5)
                    || ((this.name.equals("Pursuit")) && defender.getJustThrown())
                    || ((this.name.equals("Assurance") || this.name.equals("Revenge")) && defender.getTookDamage())
                    || ((this.name.equals("Payback")) && !attacker.getIsFirst())){
                        RawDamage = RawDamage * 2;
                    }
                    if(this.name.equals("Hex")){
                        if(defender.showBurn() ||
                        defender.showParalysis() ||
                        defender.showPoisoned() ||
                        defender.showFrozen() ||
                        defender.showAsleep()){
                            RawDamage = RawDamage*2;
                        }
                    }
                    if(attacker.getThrownOnFaint()){
                        attacker.resetThrownOnFaint();
                        if(this.name.equals("Retaliate")){
                            RawDamage = RawDamage * 2;
                        }
                    }
                    if(this.name.equals("Rollout")){
                        if(attacker.getOutrageTimer() == 4){
                            RawDamage = RawDamage * 2;
                        }
                        if(attacker.getOutrageTimer() == 3){
                            RawDamage = RawDamage * 4;
                        }
                        if(attacker.getOutrageTimer() == 2){
                            RawDamage = RawDamage * 8;
                        }
                        if(attacker.getOutrageTimer() == 1){
                            RawDamage = RawDamage * 16;
                        }
                    }
                    if(attacker.showAbility().showName().equals("Reckless")
                            && this.DamageSelf){
                        RawDamage = RawDamage * 1.2;
                    }
                    RawDamage += 2;
                    double Weather = 1;
                    if (this.type.equals(weather.showIncreaseType())) {
                        Weather = weather.showIncreaseBy();
                    }
                    if (this.type.equals(weather.showDecreaseType())) {
                        Weather = weather.showDecreasedBy();
                    }
                    int Crit = 1;
                    if (isCrit(attacker) || attacker.getWillCrit()) {
                        Crit = 2;
                        if(attacker.showAbility().getIncreasesCritDamage()){
                            Crit = 3;
                        }
                        attacker.resetWillCrit();
                    }
                    RefinedDamage = (int) (Math.round((RawDamage * Weather * Crit *
                            CalcSubtractor() * STABBonus(attacker)
                            * TypeChart.CalcTypeEffective(attacker, defender,
                            this.type, this.name)) * fromAbility));
                    if (this.name.equals("Facade")) {
                        if (attacker.showBurn() || attacker.showParalysis() || attacker.showPoisoned()) {
                            RefinedDamage = RefinedDamage * 2;
                        }
                    }
                    if (this.name.equals("Venoshock")) {
                        if (defender.showPoisoned()) {
                            RefinedDamage = RefinedDamage * 2;
                        }
                    }
                    if(this.name.equals("Knock Off")){
                        if(!defender.showItem().showName().equals("")){
                            RefinedDamage = (int) Math.round(RefinedDamage * 1.5);
                        }
                    }
                    if (terrain.showIncreaseType().equals(this.type)) {
                        RefinedDamage = (int) Math.round(RefinedDamage * terrain.showIncreasedBy());
                    }
                    if (attacker.showCharged()) {
                        RefinedDamage = (int) Math.round(RefinedDamage * 1.5);
                    }
                    if (RefinedDamage == 0) {
                        RefinedDamage = 1;
                    }
                    if (this.MultHit) {
                        System.out.println("Hit " + hitTicker + " for " + RefinedDamage);
                        savedRefinedDamage += RefinedDamage;
                    }
                    if (!this.MultHit) {
                        savedRefinedDamage = RefinedDamage;
                    }
                    hitTicker += 1;
                    if(this.name.equals("Fury Cutter")){
                        this.power = this.power * 2;
                        if(this.power >= 160){
                            this.power = 160;
                        }
                    }
                    if(this.name.equals("Pay Day")){
                        this.coins += 2*attacker.showLevel();
                    }
                }
            }
            if(!defender.showAbility().getCausesStatEffect().isEmpty()){
                defender.showAbility().statEffectOnDamage(this, attacker);
            }
        }
        if(defender.getIsProtected()){
            System.out.println("Enemy " + defender.showName() + " is protected!");
        }
        if(this.name.equals("Weather Ball")){
            this.type = "Normal";
        }
        savedRefinedDamage -= (int)  (savedRefinedDamage * defender.showAbility().getDamageReduction());
        if((defender.showSavedHP() == defender.showHP())
                && defender.showAbility().equals("Sturdy")
                && (savedRefinedDamage >= defender.showSavedHP())){
            savedRefinedDamage = defender.showHP() - 1;
        }
        if(this.name.equals("Fury Cutter")){
            this.power = 40;
        }
        return savedRefinedDamage;
    }

    private double getAttackBodyPress(Pokemon attacker, Pokemon defender,
                                     Weather weather){
        return (((2 * attacker.showLevel()) / 5.0) + 2) *
                this.power * attacker.showPhysDefense() * AttackCalc(attacker) *
                attacker.showAbility().getStatMults(attacker, defender, this, weather)[2] *
                attacker.showItem().getStatMults()[2];
    }

    private double getAttackFoulPlay(Pokemon attacker, Pokemon defender,
                                     Weather weather){
        return (((2 * attacker.showLevel()) / 5.0) + 2) *
                this.power * defender.showPhysAttack() * AttackCalc(defender) *
                attacker.showAbility().getStatMults(attacker, defender, this, weather)[0] *
                attacker.showItem().getStatMults()[0];
    }

    private double getPhysAttack(Pokemon attacker, Pokemon defender,
                                     Weather weather){
        return (((2 * attacker.showLevel()) / 5.0) + 2) *
                this.power * attacker.showPhysAttack() * AttackCalc(defender) *
                attacker.showAbility().getStatMults(attacker, defender, this, weather)[0] *
                attacker.showItem().getStatMults()[0];
    }

    private double getSpecAttack(Pokemon attacker, Pokemon defender,
                                 Weather weather){
        return (((2 * attacker.showLevel()) / 5.0) + 2)
                * this.power * attacker.showSpecAttack() * SpecAttackCalc(attacker) *
                attacker.showAbility().getStatMults(attacker, defender, this, weather)[2] *
                attacker.showItem().getStatMults()[2];
    }

    private double getPhysDef(Pokemon attacker, Pokemon defender,
                              Weather weather){
        return defender.showPhysDefense() * DefCalc(defender) *
                defender.showAbility().getStatMults(defender, attacker, this, weather)[1] *
                defender.showItem().getStatMults()[1] * 50.0;
    }

    private double getSpecDef(Pokemon attacker, Pokemon defender,
                              Weather weather){
        return defender.showSpecDefense() * SpecDefCalc(defender) *
                defender.showAbility().getStatMults(defender, attacker, this, weather)[3] *
                defender.showItem().getStatMults()[2] * 50.0;
    }

    public void swapPowers(Pokemon attacker, Pokemon defender){
        if(attacker.getThrownOnFaint()){
            attacker.resetThrownOnFaint();
        }
        if(this.swapSpeed) {
            int attackerSpeed = defender.showSpeed(1);
            defender.setSpeed(attacker.showSpeed(1));
            attacker.setSpeed(attackerSpeed);
        }
        if(this.swapPhysAtt){
            int attackerAtt = defender.showPhysAttack();
            defender.setPhysAtt(attacker.showPhysAttack());
            attacker.setPhysAtt(attackerAtt);
        }
        if(this.swapPhysDef){
            int attackerDef = defender.showPhysDefense();
            defender.setPhysDefense(attacker.showPhysDefense());
            attacker.setPhysDefense(attackerDef);
        }
        if(this.swapSpecAtt){
            int attackerSpecAtt = defender.showSpecAttack();
            defender.setSpecDef(attacker.showSpecDefense());
            attacker.setSpecDef(attackerSpecAtt);
        }
        if(this.swapSpecDef){
            int attackerSpecDef = defender.showSpecDefense();
            defender.setSpecDef(attacker.showSpecDefense());
            attacker.setSpecDef(attackerSpecDef);
        }
    }
    public void StatChange(Pokemon attacker, Pokemon defender, Pokemon PlayerPoke, Weather weather) {
        if(attacker.getThrownOnFaint()){
            attacker.resetThrownOnFaint();
        }
        if(this.name.equals("Magnetic Flux") &&
        (attacker.showAbility().showName().equals("Plus") || attacker.showAbility().showName().equals("Minus"))){
            return;
        }
        if (this.copiesStatChanges) {
            attacker.changeAttMult(defender.showAttMult());
            attacker.changeAccMult(defender.showAccMult());
            attacker.changeDefMult(defender.showDefMult());
            attacker.changeEvasMult(defender.showEvasMult());
            attacker.changeSpecAttMult(defender.showSpecAttMult());
            attacker.changeSpecDefMult(defender.showSpecDefMult());
            attacker.changeSpeedMult(defender.showSpeedMult());
        }
        if (this.garaunteeCrit) {
            attacker.setWillCrit();
            System.out.println("Your " + attacker.showName() + " will land a critical hit next turn!");
        }
        if(attacker.showAbility().showName().equals("Simple")){
            this.MultChange = this.MultChange*2;
        }
        Pokemon changed = attacker;
        if (this.StatchangeEnemy) {
            changed = defender;
            if(this.setsHPTo0PostStatChange){
                attacker.setHP(-1);
            }
        }
        if (this.MultChange < 0 && changed.getCannotHaveStatLowered() > 0){
            return;
        }
        if (this.affectsPhysAtt) {
            changed.changeAttMult(this.MultChange);
            if (this.onTimer) {
                changed.setPhysAttTimer(this.timerChange);
            }
        }
        if (this.affectsEv) {
            changed.changeEvasMult(this.MultChange);
            if (this.onTimer) {
                changed.setEvasTimer(this.timerChange);
            }
        }
        if (this.affectsAcc) {
            if (defender.showAbility().getCannotLowerAcc() && changed == defender && this.MultChange < 0) {
                System.out.println(defender.showAbility().showName() + " protects " + defender.showName() + " from lowering accuracy!");
            } else {
                changed.changeAccMult(this.MultChange);
                if (this.onTimer) {
                    changed.setAccTimer(this.timerChange);
                }
            }
        }
        if (this.affectsPhysDef) {
            if (defender.showAbility().getCannotLowerDef() && changed == defender && this.MultChange < 0) {
                System.out.println(defender.showAbility().showName() + " protects " + defender.showName() + " from lowering Defense!");
            } else {
                changed.changeDefMult(this.MultChange);
                if (this.onTimer) {
                    changed.setPhysDefTimer(this.timerChange);
                }
            }
        }
        if (this.affectsSpecAtt) {
            changed.changeSpecAttMult(this.MultChange);
            if (this.onTimer) {
                changed.setSpecAttTimer(this.timerChange);
            }
        }
        if (this.affectsSpecDef) {
            changed.changeSpecDefMult(this.MultChange);
            if (this.onTimer) {
                changed.setSpecDefTimer(this.timerChange);
            }
        }
        if (this.affectsSpeed) {
            changed.changeSpeedMult(this.MultChange);
            if (this.onTimer) {
                changed.setSpeedTimer(this.timerChange);
            }
        }
        if (PlayerPoke == attacker) {
            System.out.println("Your " + attacker.showName() + " changed the enemy " + defender.showName() + "'s " +
                    this.changeTypeName + " by " + this.MultChange);
        }
        if (!(PlayerPoke == attacker)) {
            System.out.println("Enemy " + attacker.showName() + " changed your " + defender.showName() + "'s " +
                    this.changeTypeName + " by " + this.MultChange);
        }
        if (this.statChange2) {
            changed = attacker;
            if (this.statChangeEnemy2) {
                changed = defender;
            }
            if (this.affectsPhysAtt2) {
                changed.changeAttMult(this.MultChange2);
                if (this.onTimer) {
                    changed.setPhysAttTimer(this.timerChange);
                }
            }
            if (this.affectsEv2) {
                changed.changeEvasMult(this.MultChange2);
                if (this.onTimer) {
                    changed.setEvasTimer(this.timerChange);
                }
            }
            if (this.affectsAcc2) {
                if (defender.showAbility().getCannotLowerAcc() && changed == defender && this.MultChange2 < 0) {
                    System.out.println(defender.showAbility().showName() + " protects " + defender.showName() + " from lowering accuracy!");
                } else {
                    changed.changeAccMult(this.MultChange2);
                    if (this.onTimer) {
                        changed.setAccTimer(this.timerChange);
                    }
                }
            }
            if (this.affectsPhysDef2) {
                if (defender.showAbility().getCannotLowerDef() && changed == defender && this.MultChange2 < 0) {
                    System.out.println(defender.showAbility().showName() + " protects " + defender.showName() + " from lowering Defense!");
                } else {
                    changed.changeDefMult(this.MultChange2);
                    if (this.onTimer) {
                        changed.setPhysDefTimer(this.timerChange);
                    }
                }
            }
            if (this.affectsSpecAtt2) {
                changed.changeSpecAttMult(this.MultChange2);
                if (this.onTimer) {
                    changed.setSpecAttTimer(this.timerChange);
                }
            }
            if (this.affectsSpecDef2) {
                changed.changeSpecDefMult(this.MultChange2);
                if (this.onTimer) {
                    changed.setSpecDefTimer(this.timerChange);
                }
            }
            if (this.affectsSpeed2) {
                changed.changeSpeedMult(this.MultChange2);
                if (this.onTimer) {
                    changed.setSpeedTimer(this.timerChange);
                }
            }
            if (PlayerPoke == attacker) {
                System.out.println("Your " + attacker.showName() + " changed the enemy " + defender.showName() + "'s " +
                        this.changeTypeName2 + " by " + this.MultChange2);
            }
            if (!(PlayerPoke == attacker)) {
                System.out.println("Enemy " + attacker.showName() + " changed your " + defender.showName() + "'s " +
                        this.changeTypeName2 + " by " + this.MultChange2);
            }
        }
        if(attacker.showAbility().showName().equals("Simple")){
            this.MultChange = this.MultChange/2;
        }
        defender.showAbility().addStageDuringStatChange(defender, attacker, this, weather, false);
        attacker.showAbility().addStageDuringStatChange(attacker, defender, this, weather, true);
    }

    public void setSecretPowerStats(AreaMechanics area){
        this.canFlinch = false;
        this.canParalyze = false;
        this.affectsAcc = false;
        this.changeTypeName = "";
        this.canSleep = false;
        this.canFreeze = false;
        this.affectsPhysAtt = false;
        if(area.showName().equals("Caves") || area.showName().equals("Mountains")){
            this.canFlinch = true;
        }
        if(area.showName().equals("Buildings")){
            this.canParalyze = true;
        }
        if(area.showName().equals("Deserts") || area.showName().equals("Roads")){
            this.affectsAcc = true;
            this.changeTypeName = " accuracy ";
        }
        if(area.showName().equals("Grass")){
            this.canSleep = true;
        }
        if(area.showName().equals("Snow")){
            this.canFreeze = true;
        }
        if(area.showName().equals("Water")){
            this.affectsPhysAtt = true;
            this.changeTypeName = " attack ";
        }
    }
    public void resetPP() {
        this.PP = this.savedPP;
        this.usesPerBattle = this.usesPerBattleSaved;
        this.isDisabled = 0;
    }

    public String toString(){
        return this.name + "\nType: " + this.type + "\nPP: " + this.PP;
    }
}
