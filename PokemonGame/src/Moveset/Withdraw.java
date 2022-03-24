package Moveset;

import BattleMechanics.Moves;

public class Withdraw extends Moves {
    public Withdraw() {
        name = "Withdraw";
        type = "Normal";
        PP = 40;
        dealsDamage = false;
        Healally = false;
        StatchangeEnemy = false;
        StateChangeAlly = true;
        affectsPhysAtt = false;
        affectsAcc = false;
        affectsEv = false;
        affectsSpecAtt = false;
        affectsSpecDef = false;
        affectsSpeed = false;
        affectsPhysDef = true;
        MultChange = 1;
        changeTypeName = "defense";
        savedPP = PP;
    }
}
