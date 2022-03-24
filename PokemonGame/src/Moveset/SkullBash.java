package Moveset;

import BattleMechanics.Moves;

public class SkullBash extends Moves {
    public SkullBash(){
        name = "Skull Bash";
        type = "Normal";
        power = 130;
        acc = 100;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        makesContact = true;
        savedPP = PP;
        reqCharge = true;
        turnLength = 2;
        StateChangeAlly = true;
        StatChangeReq = 100;
        statChangeReqChance = true;
        affectsPhysDef = true;
        MultChange = 1;
        changeTypeName = " defense";
    }
}
