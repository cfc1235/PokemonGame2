package Moveset.Normal;

import BattleMechanics.Moves;

public class Slam extends Moves {

    public Slam(){
        this.name = "Slam";
        this.power = 80;
        this.PP = 20;
        this.savedPP = this.PP;
        this.type = "Normal";
        this.makesContact = true;
        this.dealsDamage = true;
        this.acc = 75;
        this.CanMiss = true;
    }
}
