package Moveset;

import BattleMechanics.Moves;

public class Harden extends Moves {
    public Harden(){
        this.name = "Harden";
        this.type = "Normal";
        this.PP = 30;
        this.StateChangeAlly = true;
        this.affectsPhysDef = true;
        this.MultChange = 1;
        this.changeTypeName = " defense ";
        this.savedPP = this.PP;
    }
}
