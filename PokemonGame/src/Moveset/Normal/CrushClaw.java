package Moveset.Normal;

import BattleMechanics.Moves;

public class CrushClaw extends Moves {
    public CrushClaw() {
        this.name = "Crush Claw";
        this.type = "Normal";
        this.power = 75;
        this.acc = 95;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.statChangeReqChance = true;
        this.StatChangeReq = 50;
        this.StatchangeEnemy = true;
        this.affectsPhysDef = true;
        this.MultChange = -1;
        this.changeTypeName = " defense ";
        this.makesContact = true;
    }
}
