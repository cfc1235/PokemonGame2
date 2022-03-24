package Moveset;

import BattleMechanics.Moves;

public class Liquidation extends Moves {
    public Liquidation(){
        this.name = "Liquidation";
        this.type = "Water";
        this.power = 85;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.StatchangeEnemy = true;
        this.StatChangeReq = 20;
        this.statChangeReqChance = true;
        this.affectsPhysDef = true;
        this.MultChange = -1;
        this.changeTypeName = " defense ";
        this.makesContact = true;
        this.savedPP = this.PP;
        this.TMNum = 198;
    }
}
