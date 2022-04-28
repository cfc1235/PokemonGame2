package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Withdraw extends Moves {
    public Withdraw() {
        this.name = "Withdraw";
        this.type = "Normal";
        this.PP = 40;
        this.StateChangeAlly = true;
        this.affectsPhysDef = true;
        this.MultChange = 1;
        this.changeTypeName = "defense";
        this.savedPP = PP;
    }
}
