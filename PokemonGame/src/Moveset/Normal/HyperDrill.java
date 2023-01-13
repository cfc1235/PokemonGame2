package Moveset.Normal;

import BattleMechanics.Moves;

public class HyperDrill extends Moves {

    public HyperDrill() {
        this.name = "Hyper Drill";
        this.type = "Normal";
        this.power = 100;
        this.acc = 100;
        this.PP = 5;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
        this.ignoresProtect = true;
    }
}
