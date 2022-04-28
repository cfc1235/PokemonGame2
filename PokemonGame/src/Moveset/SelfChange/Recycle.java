package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Recycle extends Moves {
    public Recycle(){
        this.name = "Recycle";
        this.type = "Normal";
        this.usesSpentItem = true;
        this.PP = 10;
        this.savedPP = this.PP;
        this.TMNum = 267;
    }
}
