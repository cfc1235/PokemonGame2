package Moveset.Dark;

import BattleMechanics.Moves;

public class Assurance extends Moves {

    public Assurance(){
        this.name = "Assurance";
        this.type = "Dark";
        this.acc = 100;
        this.CanMiss = true;
        this.PP = 10;
        this.savedPP = this.PP;
        this.power = 60;
        this.makesContact = true;
        this.TMNum = 58;
    }

}
