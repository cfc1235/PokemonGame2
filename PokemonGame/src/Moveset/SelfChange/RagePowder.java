package Moveset.SelfChange;

import BattleMechanics.Moves;

public class RagePowder extends Moves {
    public RagePowder(){
        this.name = "Rage Powder";
        this.type = "Bug";
        this.PP = 20;
        this.StateChangeAlly = true;
        this.statChange2 = true;
        this.affectsPhysDef2 = true;
        this.affectsPhysAtt =true;
        this.MultChange = 2;
        this.MultChange2 = -1;
        this.changeTypeName = " attack sharply ";
        this.changeTypeName2 = " defense ";
        this.savedPP = this.PP;
    }
}
