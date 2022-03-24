package Moveset;

import BattleMechanics.Moves;

public class Charm extends Moves {
    public Charm(){
        name = "Charm";
        type = "Fairy";
        PP = 20;
        dealsDamage = false;
        Healally = false;
        StatchangeEnemy = true;
        StateChangeAlly = false;
        affectsPhysAtt = true;
        affectsAcc = false;
        affectsEv = false;
        affectsSpecAtt = false;
        affectsSpecDef = false;
        affectsSpeed = false;
        affectsPhysDef = false;
        MultChange = -1;
        changeTypeName = " attack ";
        savedPP = PP;
        TMNum = 29;
    }
}
