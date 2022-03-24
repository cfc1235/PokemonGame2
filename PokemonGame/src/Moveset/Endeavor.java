package Moveset;

import BattleMechanics.Moves;

public class Endeavor extends Moves {
    public Endeavor(){
        this.name = "Endeavor";
        this.PP = 5;
        this.savedPP = this.PP;
        this.type = "Normal";
        this.cutsHPTo = true;
        this.makesContact = true;
    }
}
