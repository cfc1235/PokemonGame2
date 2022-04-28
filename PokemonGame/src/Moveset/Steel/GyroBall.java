package Moveset.Steel;

import BattleMechanics.Moves;

public class GyroBall extends Moves {
    public GyroBall(){
        this.name = "Gyro Ball";
        this.type = "Steel";
        this.acc = 100;
        this.PP = 5;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
        this.TMNum = 152;
    }
}
