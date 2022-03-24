package Moveset;

import BattleMechanics.Moves;

public class MysticFire extends Moves {
    public MysticFire(){
        name = "Mystic Fire";
        type = "Fire";
        power = 75;
        acc = 100;
        PP = 10;
        savedPP = PP;
        dealsDamage = true;
        CanMiss = true;
        isSpecial = true;
        StatchangeEnemy = true;
        affectsSpecAtt = true;
        MultChange = -1;
        statChangeReqChance= true;
        StatChangeReq = 100;
        changeTypeName = "special attack ";
        TMNum = 92;
    }
}
