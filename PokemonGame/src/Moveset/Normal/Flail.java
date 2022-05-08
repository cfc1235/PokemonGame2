package Moveset.Normal;

import BattleMechanics.Moves;

public class Flail extends Moves {
    public Flail(){
        this.dealsDamage = true;
        this.CanMiss = true;
        this.acc = 100;
        this.makesContact = true;
        this.PP = 15;
        this.savedPP = this.PP;
        this.name = "Flail";
        this.type = "Normal";
    }
}
