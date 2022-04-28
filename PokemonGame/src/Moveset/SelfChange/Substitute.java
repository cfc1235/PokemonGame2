package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Substitute extends Moves {
    public Substitute() {
        this.name = "Substitute";
        this.createsSubstitute = true;
        this.type = "Normal";
        this.PP = 10;
        this.savedPP = this.PP;
        this.TMNum = 120;
    }
}
