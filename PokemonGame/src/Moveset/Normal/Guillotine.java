package Moveset.Normal;

import BattleMechanics.Moves;

public class Guillotine extends Moves {
    public Guillotine(){
        this.name = "Guillotine";
        this.CanMiss = true;
        this.acc = 30;
        this.PP = 5;
        this.savedPP = this.PP;
        this.type = "Normal";
        this.cutsHPTo = true;
        this.makesContact = true;
    }
}
