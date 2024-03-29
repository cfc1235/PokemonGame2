package BattleMechanics.Vortex;

import BattleMechanics.BaseVortex;

public class FireSpin extends BaseVortex {
    public FireSpin(){
        this.dealsDamage = true;
        this.Name = "Fire Spin";
        this.lowestTurnLimit = 4;
        this.MaxTurnLimit = 5;
        this.damage = 1/8.0;
        this.cannotLeave = true;
        setTurnLength();
    }
}
