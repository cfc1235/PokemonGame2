package Moveset.Fighting;

import BattleMechanics.Moves;

public class LowSweep extends Moves {
    public LowSweep(){
        this.name = "Low Sweep";
        this.type = "Fighting";
        this.power = 65;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.statChangeReqChance = true;
        this.StatChangeReq = 100;
        this.StatchangeEnemy = true;
        this.affectsSpeed = true;
        this.MultChange = -1;
        this.changeTypeName = " speed ";
        this.makesContact = true;
        this.TMNum = 75;
    }
}
