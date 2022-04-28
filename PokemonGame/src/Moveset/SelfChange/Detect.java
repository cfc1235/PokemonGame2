package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Detect extends Moves {
    public Detect(){
        this.fullDef = true;
        this.type = "Fighting";
        this.PP = 5;
        this.savedPP = this.PP;
        this.name = "Detect";
    }
}
