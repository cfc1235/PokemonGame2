package Moveset;

import BattleMechanics.Moves;

public class Recycle extends Moves {
    public Recycle(){
        this.name = "Recycle";
        this.type = "Normal";
        this.TMNum = 367;
        this.usesSpentItem = true;
        this.PP = 10;
        this.savedPP = this.PP;
    }
}
