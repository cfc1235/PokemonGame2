package Moveset.Water;

import BattleMechanics.Moves;

public class Dive extends Moves {
    public Dive(){
        this.name = "Dive";
        this.type = "Water";
        this.power = 80;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.reqCharge = true;
        this.turnLength = 2;
        this.TMNum = 45;
        this.cannotBeAttacked = true;
        this.makesContact = true;
    }
}
