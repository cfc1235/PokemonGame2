package Moveset;

import BattleMechanics.Moves;

public class SweetScent extends Moves {
    public SweetScent(){
        name = "Sweet Scent";
        type = "Normal";
        PP = 20;
        dealsDamage = false;
        Healally = false;
        StatchangeEnemy = true;
        StateChangeAlly = false;
        affectsPhysAtt = false;
        affectsAcc = false;
        affectsEv = true;
        affectsSpecAtt = false;
        affectsSpecDef = false;
        affectsSpeed = false;
        affectsPhysDef = false;
        MultChange = -2;
        changeTypeName = "evasiveness harshly ";
        savedPP = PP;
    }
}
