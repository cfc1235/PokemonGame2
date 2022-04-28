package Moveset.Water;

import BattleMechanics.Moves;

public class MuddyWater extends Moves {
    public MuddyWater(){
        this.name = "Muddy Water";
        this.type = "Water";
        this.power = 90;
        this.acc = 85;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 145;
        this.statChangeReqChance = true;
        this.StatChangeReq = 30;
        this.StatchangeEnemy = true;
        this.affectsAcc = true;
        this.MultChange = -1;
        this.changeTypeName = "accuracy ";
        this.isSpecial = true;
    }
}
