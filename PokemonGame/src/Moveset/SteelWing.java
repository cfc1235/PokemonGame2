package Moveset;

import BattleMechanics.Moves;

public class SteelWing extends Moves {
    public SteelWing(){
        name = "Steel Wing";
        type = "Steel";
        power = 70;
        acc = 90;
        PP = 25;
        savedPP = PP;
        dealsDamage = true;
        CanMiss = true;
        makesContact = true;
        StateChangeAlly = true;
        affectsPhysDef = true;
        MultChange = 1;
        statChangeReqChance= true;
        StatChangeReq = 10;
        changeTypeName = "defense ";
        TMNum = 30;
    }
}
