package Moveset.Flying;

import BattleMechanics.Moves;

public class Acrobatics extends Moves {
    public Acrobatics(){
        this.name = "Acrobatics";
        this.type = "Flying";
        this.power = 55;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
        this.TMNum = 78;
    }
}
