package Moveset;

import BattleMechanics.Moves;

public class BreakingSwing extends Moves {
    public BreakingSwing(){
        name = "Breaking Swing";
        type = "Dragon";
        power = 60;
        acc = 100;
        PP = 15;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 99;
        statChangeReqChance = true;
        StatChangeReq = 100;
        StatchangeEnemy = true;
        affectsPhysAtt = true;
        MultChange = -1;
        changeTypeName = "attack ";
    }
}
