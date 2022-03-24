package Moveset;

import BattleMechanics.Moves;

public class DefenseCurl extends Moves {
    public DefenseCurl() {
        this.name = "Defense Curl";
        this.type = "Normal";
        this.PP = 40;
        this.StateChangeAlly = true;
        this.affectsPhysDef = true;
        this.MultChange = 1;
        this.changeTypeName = " defense ";
        this.savedPP = this.PP;
    }
}
