package Moveset;

import BattleMechanics.Moves;

public class Electroweb extends Moves {
    public Electroweb() {
        name = "Electroweb";
        type = "Electric";
        power = 55;
        acc = 95;
        PP = 15;
        dealsDamage = true;
        CanMiss = true;
        StatchangeEnemy = true;
        StatChangeReq = 100;
        statChangeReqChance = true;
        affectsSpeed = true;
        MultChange = -1;
        changeTypeName = " speed ";
        isSpecial = true;
        savedPP = PP;
        TMNum = 82;
    }
}
