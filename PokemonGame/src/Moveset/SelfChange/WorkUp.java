package Moveset.SelfChange;

import BattleMechanics.Moves;

public class WorkUp extends Moves {
    public WorkUp(){
        this.name = "Work Up";
        this.type = "Normal";
        this.PP = 30;
        this.StateChangeAlly = true;
        this.affectsPhysAtt = true;
        this.affectsSpecAtt = true;
        this.MultChange = 1;
        this.changeTypeName = "attack and special attack";
        this.savedPP = this.PP;
        this.TMNum = 185;
    }
}