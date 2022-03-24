package BattleMechanics.Vortex;

import BattleMechanics.BaseVortex;

public class FireSpin extends BaseVortex {
    public FireSpin(){
        dealsDamage = true;
        Name = "Fire Spin";
        lowestTurnLimit = 4;
        MaxTurnLimit = 5;
        damage = 1/8.0;
        cannotLeave = true;
        setTurnLength();
    }
}
