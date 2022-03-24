package Moveset;

import BattleMechanics.Moves;

public class EarthPower extends Moves {
    public EarthPower(){
        name = "Earth Power";
        type = "Ground";
        power = 90;
        acc = 100;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 167;
        statChangeReqChance = true;
        StatChangeReq = 10;
        StatchangeEnemy = true;
        affectsSpecDef = true;
        MultChange = -1;
        changeTypeName = "special defense ";
    }
}
