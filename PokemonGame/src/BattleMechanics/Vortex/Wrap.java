package BattleMechanics.Vortex;

import BattleMechanics.BaseVortex;

public class Wrap extends BaseVortex {
    public Wrap() {
        this.dealsDamage = true;
        this.Name = "Wrap";
        this.lowestTurnLimit = 4;
        this.MaxTurnLimit = 5;
        this.damage = 1 / 8.0;
        this.cannotLeave = true;
        setTurnLength();
    }
}
