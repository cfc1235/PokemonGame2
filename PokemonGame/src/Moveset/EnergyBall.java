package Moveset;

import BattleMechanics.Moves;

public class EnergyBall extends Moves {
    public EnergyBall(){
        name = "Energy Ball";
        type = "Grass";
        power = 90;
        acc = 100;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        StatchangeEnemy = true;
        StatChangeReq = 10;
        statChangeReqChance = true;
        affectsSpecAtt = true;
        MultChange = -1;
        changeTypeName = " special attack";
        isSpecial = true;
        savedPP = PP;
        TMNum = 165;
    }
}
