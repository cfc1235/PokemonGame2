package Moveset.Normal;

import BattleMechanics.Moves;

public class Tackle extends Moves {

    public Tackle(){
        this.name = "Tackle";
        this.type = "Normal";
        this.power = 40;
        this.acc = 100;
        this.PP = 35;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
    }
}
