package Moveset.Normal;

import BattleMechanics.Moves;

public class Pound extends Moves {

    public Pound() {
        this.name = "Pound";
        this.type = "Normal";
        this.power = 35;
        this.acc = 100;
        this.PP = 40;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
    }
}


