package Moveset;

import BattleMechanics.Moves;

public class RockTomb extends Moves {
    public RockTomb(){
        name = "Rock Tomb";
        type = "Rock";
        power = 60;
        acc = 95;
        PP = 15;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 48;
        statChangeReqChance = true;
        StatChangeReq = 100;
        StatchangeEnemy = true;
        affectsSpeed = true;
        MultChange = -1;
        changeTypeName = "speed ";
    }
}
