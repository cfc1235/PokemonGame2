package Moveset;

import BattleMechanics.Moves;

public class Bulldoze extends Moves {
    public Bulldoze(){
        name = "Bulldoze";
        type = "Ground";
        power = 60;
        acc = 100;
        PP = 20;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 81;
        statChangeReqChance = true;
        StatChangeReq = 100;
        StatchangeEnemy = true;
        affectsSpeed = true;
        MultChange = -1;
        changeTypeName = "speed ";
        TMNum = 81;
    }
}
