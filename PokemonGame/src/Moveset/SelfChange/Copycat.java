package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Copycat extends Moves {
    public Copycat(){
        this.name = "Copycat";
        this.type = "Normal";
        this.PP = 20;
        this.savedPP = this.PP;
        this.ignoreSubstitute = true;
    }
}
