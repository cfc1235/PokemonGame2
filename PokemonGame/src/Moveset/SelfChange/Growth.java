package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Growth extends Moves {
    public Growth() {
        this.name = "Growth";
        this.type = "Normal";
        this.PP = 20;
        this.StateChangeAlly = true;
        this.affectsPhysAtt = true;
        this.affectsSpecAtt = true;
        this.MultChange = 1;
        this.changeTypeName = "attack and special attack";
        this.savedPP = this.PP;
    }
}
