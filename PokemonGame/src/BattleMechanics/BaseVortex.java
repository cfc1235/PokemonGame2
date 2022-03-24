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

    public Boolean getVortexPhysDef(){return vortexPhysDef;}
    public Boolean getVortexSpecDef(){return vortexSpecDef;}
    public Boolean getVortexPhysAtt(){return vortexPhysAtt;}
    public Boolean getVortexSpecAtt(){return vortexSpecAtt;}
    public Boolean getVortexAcc(){return vortexAcc;}
    public Boolean getVortexEv(){return vortexEv;}
    public Boolean getVortexSpeed(){return vortexSpeed;}

    public void vortexDamage(Pokemon defender){
        if (dealsDamage) {
            int vortexDamage = (int) Math.round(defender.showSavedHP() * damage);
            defender.changeHP(vortexDamage);
            System.out.println("The vortex dealt " + vortexDamage);
        }
    }

    public void endVortex(Pokemon defender){
        if(turnLength <= 0){
            System.out.println("The vortex is over!");
            if(vortexAcc){ defender.changeAccMult(-1); }
            if(vortexEv){ defender.changeEvasMult(-1); }
            if(vortexSpeed){ defender.changeSpeedMult(-1); }
            if(vortexPhysDef) { defender.changeDefMult(-1); }
            if(vortexPhysAtt) { defender.changeAttMult(-1); }
            if(vortexSpecAtt){ defender.changeSpecAttMult(-1); }
            if(vortexSpecDef) {defender.changeSpecDefMult(-1);}
            defender.killVortex();
            defender.unVortexMove();
            defender.resetVortex();
        }
    }
    public void setTurnLength(){
        if(!noRandomLength) {
            turnLength = (int) Math.round(Math.floor(Math.random() * (MaxTurnLimit - lowestTurnLimit + 1) + MaxTurnLimit));
        }
    }
    public void tickTurnLength(){
        turnLength -= 1;
    }
    public void setCannotLeave(Pokemon defender){
        if(cannotLeave){
            defender.setVortexMove();
        }
    }
    public int showTurnLength(){return turnLength;}
    public String showName(){return Name;}
    public Boolean showCannotLeave(){return cannotLeave;}
}
