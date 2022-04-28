package Moveset.Flying;

import BattleMechanics.Moves;

public class Pluck extends Moves {

    public Pluck(){
        this.takeItem = true;
        this.power = 60;
        this.makesContact = true;
        this.type = "Flying";
        this.TMNum = 288;
        this.name = "Pluck";
        this.CanMiss = true;
        this.acc = 100;
        this.PP = 20;
        this.savedPP = this.PP;
        this.dealsDamage = true;
    }
}
