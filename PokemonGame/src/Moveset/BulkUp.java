package Moveset;

import BattleMechanics.Moves;

public class BulkUp extends Moves {
    public BulkUp(){
        this.PP = 20;
        this.savedPP = this.PP;
        this.name = "Bulk Up";
        this.type = "Fighting";
        this.StateChangeAlly = true;
        this.affectsPhysAtt = true;
        this.MultChange = 1;
        this.affectsPhysDef = true;
        this.changeTypeName = " attack and defense ";
        this.TMNum = 8;
    }
}
