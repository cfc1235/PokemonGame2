package Moveset.Water;

import BattleMechanics.Moves;

public class WaveCrash extends Moves {
    public WaveCrash(){
        this.name = "Wave Crash";
        this.type = "Water";
        this.power = 75;
        this.acc = 100;
        this.PP = 10;
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
    }
}
