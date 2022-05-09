package Moveset.Ground;

import BattleMechanics.Moves;

public class DrillRun extends Moves {
    public DrillRun(){
        this.name = "Drill Run";
        this.type = "Ground";
        this.power = 60;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.affectsCrit = true;
        this.Critnum = 1;
        this.savedPP = this.PP;
    }
}
