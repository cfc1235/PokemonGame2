package Moveset.Flying;

import BattleMechanics.Moves;

public class Peck extends Moves {

    public Peck(){
        this.name = "Peck";
        this.type = "Flying";
        this.CanMiss = true;
        this.PP = 35;
        this.savedPP = this.PP;
        this.acc = 100;
        this.power = 35;
        this.makesContact = true;
        this.dealsDamage = true;
    }
}
