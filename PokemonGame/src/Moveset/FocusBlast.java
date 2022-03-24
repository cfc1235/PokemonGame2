package Moveset;

import BattleMechanics.Moves;

public class FocusBlast extends Moves {
    public FocusBlast(){
        name = "Focus Blast";
        type = "Fighting";
        power = 120;
        acc = 70;
        PP = 5;
        dealsDamage = true;
        CanMiss = true;
        StatchangeEnemy = true;
        StatChangeReq = 10;
        statChangeReqChance = true;
        affectsSpecDef = true;
        MultChange = -1;
        changeTypeName = " special defense";
        isSpecial = true;
        savedPP = PP;
        TMNum = 164;
    }
}
