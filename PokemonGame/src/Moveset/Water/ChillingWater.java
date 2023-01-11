package Moveset.Water;

import BattleMechanics.Moves;

public class ChillingWater extends Moves {
    public ChillingWater(){
        this.name = "Chilling Water";
        this.type = "Water";
        this.power = 50;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.statChangeReqChance = true;
        this.StatChangeReq = 100;
        this.StatchangeEnemy = true;
        this.affectsPhysAtt = true;
        this.MultChange = -1;
        this.changeTypeName = " attack ";
        this.isSpecial = true;
    }
}
