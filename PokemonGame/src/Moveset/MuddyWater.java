package Moveset;

import BattleMechanics.Moves;

public class MuddyWater extends Moves {
    public MuddyWater(){
        name = "Muddy Water";
        type = "Water";
        power = 90;
        acc = 85;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 145;
        statChangeReqChance = true;
        StatChangeReq = 30;
        StatchangeEnemy = true;
        affectsAcc = true;
        MultChange = -1;
        changeTypeName = "accuracy ";
        isSpecial = true;
    }
}
