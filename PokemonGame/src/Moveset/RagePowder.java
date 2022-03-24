package Moveset;

import BattleMechanics.Moves;

public class RagePowder extends Moves {
    public RagePowder(){
        name = "Rage Powder";
        type = "Bug";
        PP = 20;
        StateChangeAlly = true;
        statChange2 = true;
        affectsPhysDef2 = true;
        affectsPhysAtt =true;
        MultChange = 2;
        MultChange2 = -1;
        changeTypeName = " attack sharply ";
        changeTypeName2 = " defense ";
        savedPP = PP;
    }
}
