package Moveset.SelfChange;

import BattleMechanics.Moves;

public class DragonDance extends Moves {
    public DragonDance(){
        this.name = "Dragon Dance";
        this.type = "Dragon";
        this.PP = 20;
        this.StateChangeAlly = true;
        this.affectsPhysAtt = true;
        this.affectsSpeed = true;
        this.MultChange = 1;
        this.changeTypeName = "attack and speed ";
        this.savedPP = this.PP;
        this.TMNum = 151;
    }
}
