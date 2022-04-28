package Moveset.Flying;

import BattleMechanics.Moves;

public class Fly extends Moves {
    public Fly(){
        this.name = "Fly";
        this.type = "Flying";
        this.power = 90;
        this.acc = 95;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.reqCharge = true;
        this.turnLength = 2;
        this.TMNum = 6;
        this.cannotBeAttacked = true;
        this.makesContact = true;
    }
}
