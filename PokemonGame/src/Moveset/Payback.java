package Moveset;

import BattleMechanics.Moves;

public class Payback extends Moves {
    public Payback(){
        this.name = "Payback";
        this.type = "Dark";
        this.TMNum = 266;
        this.dealsDamage = true;
        this.power = 50;
        this.acc = 100;
        this.CanMiss = true;
        this.PP = 10;
        this.savedPP = this.PP;
        this.makesContact = true;
    }
}
