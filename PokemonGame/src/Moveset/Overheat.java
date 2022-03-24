package Moveset;

import BattleMechanics.Moves;

public class Overheat extends Moves {
    public Overheat(){
        name = "Overheat";
        type = "Fire";
        power = 130;
        acc = 90;
        PP = 5;
        dealsDamage = true;
        CanMiss = true;
        StateChangeAlly = true;
        StatChangeReq = 100;
        statChangeReqChance = true;
        affectsSpecAtt = true;
        MultChange = -2;
        changeTypeName = " special attack harshly ";
        isSpecial = true;
        savedPP = PP;
        TMNum = 143;
    }
}
