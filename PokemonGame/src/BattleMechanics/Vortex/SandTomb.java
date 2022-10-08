package BattleMechanics.Vortex;

import BattleMechanics.BaseVortex;

public class SandTomb extends BaseVortex {
    public SandTomb(){
        this.dealsDamage = true;
        this.Name = "Sand Tomb";
        this.lowestTurnLimit = 4;
        this.MaxTurnLimit = 5;
        this.damage = 1/8.0;
        this.cannotLeave = true;
        setTurnLength();
    }
}
