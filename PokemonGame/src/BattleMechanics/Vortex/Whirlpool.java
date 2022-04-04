package BattleMechanics.Vortex;

import BattleMechanics.BaseVortex;

public class Whirlpool extends BaseVortex {
    public Whirlpool(){
        this.dealsDamage = true;
        this.Name = "Whirlpool";
        this.lowestTurnLimit = 4;
        this.MaxTurnLimit = 5;
        this.damage = 1/8.0;
        this.cannotLeave = true;
        setTurnLength();
    }
}
