package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Protect extends Moves {
    public Protect(){
        this.fullDef = true;
        this.type = "Normal";
        this.PP = 10;
        this.savedPP = this.PP;
        this.TMNum = 25;
        this.name = "Protect";
    }
}
