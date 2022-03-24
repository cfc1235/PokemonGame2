package Moveset;

import BattleMechanics.Moves;

public class Psychic extends Moves {
    public Psychic(){
        name = "Psychic";
        type = "Psychic";
        power = 90;
        acc = 100;
        PP = 19;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 111;
        statChangeReqChance = true;
        StatChangeReq = 10;
        StatchangeEnemy = true;
        affectsSpecDef = true;
        MultChange = -1;
        changeTypeName = " special defense ";
        isSpecial = true;
    }
}
