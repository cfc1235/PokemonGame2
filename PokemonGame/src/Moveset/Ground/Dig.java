package Moveset.Ground;

import BattleMechanics.Moves;

public class Dig extends Moves {
    public Dig(){
        this.name = "Dig";
        this.type = "Ground";
        this.power = 80;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.reqCharge = true;
        this.turnLength = 2;
        this.TMNum = 15;
        this.cannotBeAttacked = true;
        this.makesContact = true;
    }
}
