package PokemonCreation;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Weather.Weather;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Abilities {
    protected String name;
    protected Boolean hasReqsinDamage = false;
    protected Boolean changeEnemyAcc = false;
    protected double changeEnAcc;
    protected Boolean changeEnemyEvas = false;
    protected double changeEnEvas;
    protected Boolean changeSelfAcc = false;
    protected double changeSelfAccuracy;
    protected double possSelfAccuracy;
    protected double possSelfAccuracy2;
    protected Boolean changeSelfEvas = false;
    protected double changeSelfEvasion = 1;
    protected Boolean changeSelfAtt = false;
    protected double changeSAtt;
    protected Boolean changeEnAtt = false;
    protected double changeEAtt;
    protected Boolean changeSelfSpecAtt = false;
    protected double changeSSpecAtt;
    protected Boolean changeEnSpecAtt = false;
    protected double changeESpecAtt;
    protected Boolean changeSelfDef = false;
    protected double changeSDef;
    protected Boolean changeEnDef = false;
    protected double changeEDef;
    protected Boolean changeSelfSpecDef = false;
    protected double changeSSpecDef;
    protected Boolean changeEnSpecDef = false;
    protected double changeESpecDef;
    protected Boolean changeEnSpeed = false;
    protected double changeESpeed;
    protected Boolean changeSelfSpeed = false;
    protected double changeSSpeed;
    protected double Healback;
    protected Boolean HealWeather = false;
    protected Boolean WeatherRequirement = false;
    protected String WeatherReq = "";
    protected Boolean HPDownRequirement = false;
    protected double HPReq;
    protected Boolean DealSelf = false;
    protected Boolean affectsCrit = false;
    protected int critNum = 0;
    protected Boolean HealHelp = false;
    protected int HealHelpAm = 0;
    protected Boolean cannotSleep = false;
    protected Boolean cannotBurn = false;
    protected Boolean cannotParalyze = false;
    protected Boolean cannotFreeze = false;
    protected Boolean cannotPoison = false;
    protected Boolean noSecondary = false;
    protected Boolean alwaysFlee = false;
    protected Boolean resolveOnEnd = false;
    protected Boolean endsEffects = false;
    protected double endResolveChance = 0;
    protected Boolean changesNotEffective = false;
    protected double changeNotEffectiveAm = 0;
    protected Boolean ignoresEvas = false;
    protected Boolean cannotLowerAcc = false;
    protected Boolean activatesOnConfuse = false;
    protected Boolean cannotLowerDef = false;
    protected Boolean onAllStat = false;
    protected Boolean requiresSpecial = false;
    protected Boolean requiresPhys = false;
    protected Boolean usesBerry = false;
    protected ArrayList<CreateOrderedMap<String, Double>> typesAffected = new ArrayList<>();
    protected Boolean affectsType = false;
    protected Boolean affectsSelfType = false;
    protected Boolean onStart = false;
    protected Boolean cutSleep = false;
    protected int cutSleepBy = 0;
    protected List<String> onMultTypes = new ArrayList<>();
    protected Boolean requiresType = false;
    protected Boolean onDealingDamage = false;
    protected Boolean onDealtDamage = false;
    protected List<String> affectedMoveList = new ArrayList<>();
    protected Boolean onMove = false;
    protected double onMoveAddDamage = 1;
    protected Boolean increasesCritDamage = false;
    protected Boolean ignoresWeather = false;
    protected Boolean ignoresMove = false;
    protected List<String> ignoresMovesNames = new ArrayList<>();
    protected Boolean isMultiplier = false;
    protected Boolean needsGenderForPos = false;
    protected String requiredGenderForPos = "";
    protected Boolean needsGenderForNeg = false;
    protected String requiredGenderForNeg = "";
    protected double[] statMults = new double[7];
    protected Boolean ignoresParalysisSpeed = false;
    protected Boolean activateOnDeath = false;
    protected Boolean abilitiesCounter = false;
    protected List<String> counteringAbilities = new ArrayList();
    protected Boolean healOnType = false;
    protected String healType = "";
    protected ArrayList<String> causesStatEffect = new ArrayList<>();
    protected double statChance = 0.0;
    protected Boolean onStatChange;
    protected Boolean onChangingStat;
    protected Boolean positiveMultChange = false;
    protected Boolean needsSpeedTime = false;
    protected Boolean speedTime = false;
    protected Boolean onEndFight = false;
    protected String onEffect = "";
    protected Boolean noFlinch = false;
    protected double damageReduction = 0;
    protected Boolean powersRawDamage = false;
    protected Boolean attackerNoSecondary = false;
    protected Boolean noRecoil = false;

    public Boolean getNoRecoil(){return this.noRecoil;}
    public Boolean getAttackerNoSecondary(){return this.attackerNoSecondary;}
    public double getDamageReduction(){return this.damageReduction;}
    public Boolean getNoFlinch(){return this.noFlinch;}
    public ArrayList<String> getCausesStatEffect(){return this.causesStatEffect;}
    public void statEffectOnDamage(Moves moves, Pokemon attacker){
        if(!this.causesStatEffect.isEmpty()) {
            if ((moves.getIsSpecial() && this.requiresSpecial) ||
                    (!moves.getIsSpecial() && this.requiresPhys) ||
                    (!this.requiresSpecial && !this.requiresPhys)) {
                Collections.shuffle(this.causesStatEffect);
                if (this.statChance > new Random().nextDouble()) {
                    String effect = this.causesStatEffect.get(0);
                    if(effect.equals("Burn")){
                        attacker.Burn();
                    }
                    if(effect.equals("Sleep")){
                        attacker.Sleep();
                    }
                    if(effect.equals("Paralysis")){
                        attacker.Paralyze("","","");
                    }
                    if(effect.equals("Freeze")){
                        attacker.Freeze();
                    }
                    if(effect.equals("Poison")){
                        attacker.Poison();
                    }
                    if(effect.equals("Infatuate")){
                        attacker.Infatuate();
                    }
                }
            }
        }
    }
    public Boolean getOnStatChange(){return this.onStatChange;}
    public Boolean getHealOnType(){return this.healOnType;}
    public Boolean getAbilitiesCounter(){return this.abilitiesCounter;}
    public List<String> getCounteringAbilities(){return this.counteringAbilities;}
    public Boolean getActivateOnDeath(){return this.activateOnDeath;}
    public Boolean getIgnoresParalysisSpeed(){return this.ignoresParalysisSpeed;}
    public double[] getStatMults(Pokemon attacker, Pokemon defender,
                                 Moves move, Weather weather){
        this.setStatMults(defender, attacker, move, weather);
        return this.statMults;
    }
    public List<String> getIgnoresMovesNames(){return this.ignoresMovesNames;}
    public Boolean getIgnoresMove(){return  this.ignoresMove;}
    public Boolean getIgnoresWeather(){return this.ignoresWeather;}
    public Boolean getIncreasesCritDamage(){return this.increasesCritDamage;}
    public Boolean getCutSleep(){return cutSleep;}
    public int getCutSleepBy(){return cutSleepBy;}
    public Boolean getOnStart(){return onStart;}
    public double getHPReq(){return HPReq;}
    public Boolean getHasReqsinDamage(){return hasReqsinDamage;}
    public Boolean getAffectsSelfType(){return affectsSelfType;}
    public ArrayList<CreateOrderedMap<String, Double>> getTypesAffected(){return typesAffected;}
    public Boolean getAffectsType(){return affectsType;}
    public Boolean getUsesBerry(){return usesBerry;}
    public Boolean getCannotLowerDef(){return cannotLowerDef;}
    public Boolean getIgnoresEvas(){return ignoresEvas;}
    public Boolean getCannotLowerAcc(){return cannotLowerAcc;}
    public Boolean showChangesNotEffective(){return changesNotEffective;}
    public double showChangeNotEffectiveAm(){return changeNotEffectiveAm;}
    public Boolean showResolveOnEnd(){return resolveOnEnd;}
    public Boolean showAlwaysFlee(){return alwaysFlee;}
    public Boolean showNoSecondary(){return noSecondary;}
    public String showName() {
        return name;
    }
    public Boolean showHealWeather(){return HealWeather;}
    public Boolean showSleep(){return cannotSleep;}
    public Boolean showBurn(){return  cannotBurn;}
    public Boolean showParalyze(){return cannotParalyze;}
    public Boolean showFreeze(){return cannotFreeze;}
    public Boolean showPoison(){return cannotPoison;}
    public Boolean getActivatesOnConfuse(){return this.activatesOnConfuse;}

    public void resolveEndFight(Pokemon pokemon){
        double random = new Random().nextDouble();
        if(this.onEndFight) {
            if (this.name.equals("Pickup")) {
                if (random <= .1) {
                    if(!pokemon.showItem().showName().equals("")){
                        pokemon.giveItem(GetItem.getRandomItem());
                    }
                }
            }
        }
    }
    public void resolveEndTurn(Pokemon attacker){
        if(this.endsEffects){
            if(this.endResolveChance >= Math.random()){
                attacker.unFreeze();
                attacker.unBurn();
                attacker.unParalyze();
                attacker.Wake();
                attacker.unPoison();
            }
        }
    }

    public int HealHelp(){
        if(this.HealHelp){
            return this.HealHelpAm;
        }
        return 1;
    }
    public int Heal(String weather, int savedHP, Moves moves) {
        int Heal = 1;
        if ((this.HealWeather && this.WeatherReq.equals(weather)) ||
            (this.healOnType && this.healType.equals(moves.showType()))){
                if (!this.DealSelf) {
                    Heal = (int) Math.round(savedHP * this.Healback);
                }
                if (this.DealSelf) {
                    Heal = (int) (Math.round(savedHP * this.Healback) * -1);
                }
            }
        return Heal;
    }

    public double affectedOnDamage(Moves move){
        double damage = 1;
        if(this.onMove && this.affectedMoveList.contains(move.showName())){
            damage += this.onMoveAddDamage;
        }
        if(this.powersRawDamage){
            damage += this.onMoveAddDamage;
        }
        return damage;
    }

    public void setStatMults(Pokemon defender, Pokemon attacker,
                             Moves moves, Weather weather) {
        //[Phys Att, Phys Def, Spec Att, Spec Def, Speed, Acc, Evas]
        int i = 0;
        while (i < 8){
            this.statMults[i] = 0;
            i += 1;
        }
        if (this.isMultiplier) {
            if (this.needsGenderForNeg &&
                defender.showGender().equals(this.requiredGenderForNeg)) {
                this.changeSelfAccuracy = this.possSelfAccuracy2;
            }
            if (this.needsGenderForPos &&
                defender.showGender().equals(this.requiredGenderForPos)) {
                this.changeSelfAccuracy = this.possSelfAccuracy;
            }
            if ((this.onAllStat && (attacker.showIsConfused() || attacker.showBurn()
                    || attacker.showFrozen() || attacker.showAsleep() ||
                    attacker.showParalysis() || attacker.showPoisoned())) ||
                !this.onAllStat ||
                (this.requiresPhys && !moves.getIsSpecial()) ||
                (this.requiresSpecial && moves.getIsSpecial()) ||
                (this.showName().equals("Plus") && defender.showAbility().showName().equals("Minus")) ||
                (this.showName().equals("Minus") && defender.showAbility().showName().equals("Plus")) ||
                ((this.WeatherRequirement = true) && (this.WeatherReq.equals(weather.showName())))){
                    editStatMults();
            }
        }
    }

    private void editStatMults(){
        //[Phys Att, Phys Def, Spec Att, Spec Def, Speed, Acc, Evas]
        if(this.changeSelfAtt){
            this.statMults[0] = this.changeSAtt;
        }
        if(this.changeSelfDef){
            this.statMults[1] = this.changeSDef;
        }
        if(this.changeSelfSpecAtt){
            this.statMults[2] = this.changeSSpecAtt;
        }
        if(this.changeSelfSpecDef){
            this.statMults[3] = this.changeSSpecDef;
        }
        if (this.changeSelfSpeed) {
            this.statMults[4] = this.changeSSpeed;
        }
        if(this.changeSelfAcc){
            this.statMults[5] = this.changeSelfAccuracy;
        }
        if (this.changeSelfEvas) {
            this.statMults[6] = this.changeSelfEvasion;
        }
    }

    public void addStageOnDeath(Pokemon attacker){
        if(this.activateOnDeath) {
            doSelfChange(attacker);
        }
    }

    public void addStageDuringDamage(Pokemon defender, Pokemon attacker,
                                     Moves moves, Weather weather,
                                     Boolean damageTime, Boolean isFirst){
        //DAMAGETIME IS TRUE IF DEALING DAMAGE.
        // FALSE IF DAMAGE DEALT TO THEM
        if(damageTime || !this.name.equals("Mold Breaker")) {
            if ((this.onDealtDamage && !damageTime) || (this.onDealingDamage && damageTime)
                    || (!this.requiresType || this.onMultTypes.contains(moves.showType()))
                    || (this.WeatherReq.equals(weather) || !this.WeatherRequirement)
                    || (this.hasReqsinDamage && (defender.showHP() / (double) defender.showSavedHP()) < this.HPReq)
                    || (this.needsSpeedTime && (this.speedTime = isFirst))
            ) {
                doChange(attacker, defender);
            }
        }
    }

    public void addStageDuringStatChange(Pokemon defender, Pokemon attacker,
                                     Moves moves, Weather weather,
                                     Boolean damageTime){
        //DAMAGETIME IS TRUE IF DEALING STAT CHANGE.
        // FALSE IF DAMAGE STAT CHANGE TO THEM
        boolean positiveChange = true;
        if(moves.getMultChange() < 0) {
            positiveChange = false;
        }
        if(damageTime || !this.name.equals("Mold Breaker")) {
            if ((this.onStatChange && !damageTime) || (this.onChangingStat && damageTime) ||
                    ((this.requiresType && this.onMultTypes.contains(moves.showType())) || !this.requiresType)
                    || (this.WeatherReq.equals(weather) || !this.WeatherRequirement)
            ) {
                if (this.positiveMultChange == positiveChange) {
                    doChange(attacker, defender);
                }
            }
        }
    }

    public void addStageDuringEffect(Pokemon attacker, Pokemon defender,
                                     String effect){
        if(this.onEffect.equals(effect)){
            doChange(attacker, defender);
        }
    }

    public Boolean getAffectsCrit(){
        return affectsCrit;
    }
    public int getCritNum(){
        return critNum;
    }

    public void resolveStart(Pokemon thrown, Pokemon defender,
                             Weather weather){
        if(thrown.showAbility().getOnStart()){
            if(thrown.showAbility().showName().equals("Frisk")){
                System.out.println(defender.showItem().showName());
            }
        }
        if(this.WeatherReq.equals(weather) || !this.WeatherRequirement
        || !this.abilitiesCounter ||
        (this.abilitiesCounter && !this.counteringAbilities.contains(defender.showAbility().showName()))){
            doChange(thrown, defender);
        }
    }

    private void doSelfChange(Pokemon attacker){
        if (this.changeSelfSpeed) {
            attacker.changeSpeedMult(this.changeSSpeed);
        }
        if (this.changeSelfEvas) {
            attacker.changeEvasMult(this.changeSelfEvasion);
        }
        if(this.changeSelfAtt){
            attacker.changeAttMult(this.changeSAtt);
        }
        if(this.changeSelfSpecAtt){
            attacker.changeSpecAttMult(this.changeSSpecAtt);
        }
        if(this.changeSelfDef){
            attacker.changeDefMult(this.changeSDef);
        }
        if(this.changeSelfSpecDef){
            attacker.changeSpecDefMult(this.changeSSpecDef);
        }
        if(this.changeSelfAcc){
            attacker.changeAccMult(this.changeSelfAccuracy);
        }
    }

    private void doEnChange(Pokemon defender){
        if (this.changeEnSpeed) {
            defender.changeSpeedMult(this.changeESpeed);
        }
        if (this.changeEnemyAcc) {
            defender.changeAccMult(this.changeEnAcc);
        }
        if(this.changeEnemyEvas){
            defender.changeEvasMult(this.changeEnEvas);
        }
        if(this.changeEnAtt){
            defender.changeAttMult(this.changeEAtt);
        }
        if(this.changeEnSpecAtt){
            defender.changeSpecAttMult(this.changeESpecAtt);
        }
        if(this.changeEnDef){
            defender.changeDefMult(this.changeEDef);
        }
        if(this.changeEnSpecDef){
            defender.changeSpecDefMult(this.changeESpecDef);
        }
    }
    protected void doChange(Pokemon attacker, Pokemon defender){
        doSelfChange(attacker);
        doEnChange(defender);
    }
}
