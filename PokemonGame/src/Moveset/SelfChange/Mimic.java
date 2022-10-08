package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Mimic extends Moves {
    public Mimic(){
        this.name = "Mimic";
        this.type = "Normal";
        this.PP = 10;
        this.savedPP = this.PP;
        this.ignoreSubstitute = true;
    }
}
