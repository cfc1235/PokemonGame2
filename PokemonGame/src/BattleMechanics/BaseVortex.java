package BattleMechanics;

import PokemonCreation.Pokemon;


public class BaseVortex {
    protected Boolean dealsDamage = false;
    protected int turnLength = 0;
    protected int lowestTurnLimit = 0;
    protected int MaxTurnLimit = 0;
    protected double damage = 0;
    protected Boolean cannotLeave = false;
    protected String Name = "";
    protected Boolean vortexSpeed = false;
    protected Boolean vortexPhysDef = false;
    protected Boolean vortexPhysAtt = false;
    protected Boolean vortexSpecAtt = false;
    protected Boolean vortexSpecDef = false;
    protected Boolean vortexAcc = false;
    protected Boolean vortexEv  = false;
    protected Boolean noRandomLength = false;

    public Boolean getVortexPhysDef(){return  this.vortexPhysDef;}
    public Boolean getVortexSpecDef(){return  this.vortexSpecDef;}
    public Boolean getVortexPhysAtt(){return  this.vortexPhysAtt;}
    public Boolean getVortexSpecAtt(){return  this.vortexSpecAtt;}
    public Boolean getVortexAcc(){return  this.vortexAcc;}
    public Boolean getVortexEv(){return  this.vortexEv;}
    public Boolean getVortexSpeed(){return  this.vortexSpeed;}

    public void vortexDamage(Pokemon defender){
        if (this.dealsDamage) {
            int vortexDamage = (int) Math.round(defender.showSavedHP() * damage);
            defender.changeHP(vortexDamage);
            System.out.println("The vortex dealt " + vortexDamage);
        }
    }

    public void endVortex(Pokemon defender){
        if( this.turnLength <= 0){
            System.out.println("The vortex is over!");
            if(this.vortexAcc){ defender.changeAccMult(-1); }
            if(this.vortexEv){ defender.changeEvasMult(-1); }
            if(this.vortexSpeed){ defender.changeSpeedMult(-1); }
            if(this.vortexPhysDef) { defender.changeDefMult(-1); }
            if(this.vortexPhysAtt) { defender.changeAttMult(-1); }
            if(this.vortexSpecAtt){ defender.changeSpecAttMult(-1); }
            if(this.vortexSpecDef) {defender.changeSpecDefMult(-1);}
            defender.killVortex();
            defender.unVortexMove();
            defender.resetVortex();
        }
    }
    public void setTurnLength(){
        if(!this.noRandomLength) {
            this.turnLength = (int) Math.round(Math.floor(Math.random() * (MaxTurnLimit - lowestTurnLimit + 1) + MaxTurnLimit));
        }
    }
    public void tickTurnLength(){
        this.turnLength -= 1;
    }
    public void setCannotLeave(Pokemon defender){
        if(this.cannotLeave){
            defender.setVortexMove();
        }
    }
    public int showTurnLength(){return this.turnLength;}
    public String showName(){return this.Name;}
    public Boolean showCannotLeave(){return this.cannotLeave;}
}
