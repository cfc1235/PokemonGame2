package Moveset;

import BattleMechanics.Moves;

public class DoubleTeam extends Moves {
    public DoubleTeam(){
        this.name = "Double Team";
        this.type = "Normal";
        this.StateChangeAlly = true;
        this.PP = 15;
        this.savedPP = this.PP;
        this.affectsSpeed = true;
        this.MultChange = 1;
        this.changeTypeName = " speed ";
        this.TMNum = 32;
    }
}
