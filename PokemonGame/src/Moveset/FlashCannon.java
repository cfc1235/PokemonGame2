package Moveset;

import BattleMechanics.Moves;

public class FlashCannon extends Moves {
    public FlashCannon(){
        name = "Flash Cannon";
        type = "Steel";
        power = 80;
        acc = 100;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        StatchangeEnemy = true;
        StatChangeReq = 10;
        statChangeReqChance = true;
        affectsSpecDef = true;
        MultChange = -1;
        changeTypeName = " special defense ";
        isSpecial = true;
        savedPP = PP;
        TMNum = 170;
    }
}
