package Moveset;

import BattleMechanics.Moves;

public class Crunch extends Moves {
    public Crunch(){
        name = "Crunch";
        type = "Dark";
        power = 80;
        acc = 100;
        PP = 15;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 132;
        statChangeReqChance = true;
        StatChangeReq = 20;
        StatchangeEnemy = true;
        affectsPhysDef = true;
        MultChange = -1;
        changeTypeName = "defense ";
        makesContact = true;
    }
}
