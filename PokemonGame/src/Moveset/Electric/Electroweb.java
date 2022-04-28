package Moveset.Electric;

import BattleMechanics.Moves;

public class Electroweb extends Moves {
    public Electroweb() {
        this.name = "Electroweb";
        this.type = "Electric";
        this.power = 55;
        this.acc = 95;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.StatchangeEnemy = true;
        this.StatChangeReq = 100;
        this.statChangeReqChance = true;
        this.affectsSpeed = true;
        this.MultChange = -1;
        this.changeTypeName = " speed ";
        this.isSpecial = true;
        this.savedPP = this.PP;
        this.TMNum = 82;
    }
}
