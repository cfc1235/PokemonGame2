package Moveset;

import BattleMechanics.Moves;

public class SuperFang extends Moves {
    public SuperFang(){
        this.name = "Super Fang";
        this.PP = 10;
        this.savedPP = this.PP;
        this.type = "Normal";
        this.cutHPBy = .5;
        this.cutsHPTo = true;
        this.makesContact = true;
        this.CanMiss = true;
        this.acc = 90;
    }
}
