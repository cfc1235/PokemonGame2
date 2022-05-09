package PokemonCreation;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;

import java.util.ArrayList;

public class Items {
    protected String name;
    protected Boolean affectCrit = false;
    protected int Critnum;
    public Boolean CritrequiresID = false;
    public String RequireName;
    protected int newCritNum;
    protected int flingDamage = 0;
    protected Boolean isBerry = false;
    protected int healAm = 0;
    protected Boolean canHeal = false;
    protected Boolean isConsumable = false;
    protected Boolean itemUsed = false;
    protected Boolean curesPoison = false;
    protected Boolean garunteesLeave = false;
    protected Boolean givesEXP = false;
    protected int EXPGiven = 0;
    protected int purchasePrice = 0;
    protected int sellPrice = 0;
    protected ArrayList<CreateOrderedMap<String, Double>> typesAffected = new ArrayList<>();
    protected Boolean affectsType = false;
    protected Boolean affectsSelfType = false;
    protected boolean changeSelfAtt = false;
    protected double[] statMults = new double[7];
    protected double changeSAtt = 0;
    protected boolean changeSelfDef = false;
    protected boolean changeSelfSpecAtt = false;
    protected double changeSDef = 0;
    protected double changeSSpecAtt = 0;
    protected boolean changeSelfSpecDef = false;
    protected double changeSSpecDef = 0;
    protected boolean changeSelfSpeed = false;
    protected boolean changeSelfAcc = false;
    protected double changeSSpeed = 0;
    protected double changeSelfAccuracy = 0;
    protected boolean changeSelfEvas = false;
    protected double changeSelfEvasion = 0;
    protected boolean curesParalysis = false;
    protected boolean forcesEvol = false;
    protected double healByPercMax = 0;

    public Boolean getForcesEvol(){return this.forcesEvol;}
    public ArrayList<CreateOrderedMap<String, Double>> getTypesAffected(){return this.typesAffected;}
    public Boolean getAffectsType(){return this.affectsType;}
    public Boolean getAffectsSelfType(){return this.affectsSelfType;}
    public int getPurchasePrice(){return this.purchasePrice;}
    public int getSellPrice(){return this.sellPrice;}
    public Boolean getGivesEXP(){return this.givesEXP;}
    public int getEXPGiven(){return this.EXPGiven;}
    public Boolean getGarunteesLeave(){return this.garunteesLeave;}
    public Boolean getItemUsed(){return this.itemUsed;}
    public Boolean getIsConsumable(){return this.isConsumable;}
    public Boolean getIsBerry(){return this.isBerry;}
    public int showFlingDamage(){return this.flingDamage;}
    public String showName(){
        return this.name;
    }
    public double showCritChange(Pokemon attacker) {
        if(!attacker.showName().equals("Klutz")) {
            this.itemUsed = true;
            if (!this.CritrequiresID) {
                return this.Critnum;
            }
            if (this.RequireName.equals(attacker.showName())) {
                return this.newCritNum;
            }
            if (!this.RequireName.equals(attacker.showName())) {
                return this.Critnum;
            }
        }
        return 0;
    }
    public Boolean decideCrit(){
        this.itemUsed = true;
        return this.affectCrit;
    }
    public void useBerry(Pokemon user, Boolean magicRoom){
        if(!magicRoom){
            this.itemUsed = true;
            if(this.isBerry){
                if(this.canHeal){
                    user.changeHP(-1 * this.healAm);
                }
                if(this.curesPoison){
                    user.unPoison();
                }
                if(this.curesParalysis){
                    user.unParalyze();
                }
                if(this.canHeal) {
                    if (this.healAm > 0) {
                        user.changeHP(-1 * this.healAm);
                    } else {
                        user.changeHP(-1 * (int) (this.healByPercMax * user.showSavedHP()));
                    }
                }
            }
        }
    }


    public double[] getStatMults(){
        //[Phys Att, Phys Def, Spec Att, Spec Def, Speed, Acc, Evas]
        int i = 0;
        while (i < 8){
            this.statMults[i] = 0;
            i += 1;
        }
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
        return this.statMults;
    }

    public Boolean getStatMultsDuringDamage(Moves moves, Pokemon pokemon,
                                            Boolean magicRoom){
        getStatMults();
        Boolean isUsed = false;
        if(!magicRoom){
            if(!pokemon.showName().equals("Klutz")){
                for(CreateOrderedMap<String, Double> types : this.typesAffected) {
                    if (types.getKey().equals(moves.showName())) {
                        doStatChanges(pokemon);
                        isUsed = true;
                    }
                }
            }
        }
        return isUsed;
    }

    private void doStatChanges(Pokemon pokemon){
        pokemon.changeAttMult(this.statMults[0]);
        pokemon.changeDefMult(this.statMults[1]);
        pokemon.changeSpecAttMult(this.statMults[2]);
        pokemon.changeSpecDefMult(this.statMults[3]);
        pokemon.changeSpeedMult(this.statMults[4]);
        pokemon.changeAccMult(this.statMults[5]);
        pokemon.changeEvasMult(this.statMults[6]);
    }
}
