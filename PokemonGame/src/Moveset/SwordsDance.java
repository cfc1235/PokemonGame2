package Moveset;

import BattleMechanics.Moves;

public class SwordsDance extends Moves {
    public SwordsDance(){
        name = "Swords Dance";
        type = "Normal";
        PP = 20;
        dealsDamage = false;
        Healally = false;
        StatchangeEnemy = false;
        StateChangeAlly = true;
        affectsPhysAtt = true;
        affectsAcc = false;
        affectsEv = false;
        affectsSpecAtt = false;
        affectsSpecDef = false;
        affectsSpeed = false;
        affectsPhysDef = false;
        MultChange = 2;
        changeTypeName = "attack sharply";
        savedPP = PP;
        TMNum = 100;
    }
}
