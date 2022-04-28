package Moveset.SelfChange;

import BattleMechanics.Moves;

public class PsychUp extends Moves {

    public PsychUp(){
        this.name = "Psych Up";
        this.type = "Normal";
        this.copiesStatChanges = true;
        this.StateChangeAlly = true;
        this.PP = 10;
        this.savedPP = this.PP;
        this.TMNum = 277;
    }
}
