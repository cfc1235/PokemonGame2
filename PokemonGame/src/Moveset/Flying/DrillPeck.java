package Moveset.Flying;

import BattleMechanics.Moves;

public class DrillPeck extends Moves {
    public DrillPeck(){
        this.name = "Drill Peck";
        this.power = 80;
        this.PP = 20;
        this.savedPP = this.PP;
        this.type = "Flying";
        this.makesContact = true;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.acc = 100;
    }
}
