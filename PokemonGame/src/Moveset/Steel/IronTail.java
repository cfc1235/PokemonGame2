package Moveset.Steel;

import BattleMechanics.Moves;

public class IronTail extends Moves {
    public IronTail(){
        this.name = "Iron Tail";
        this.type = "Steel";
        this.power = 100;
        this.acc = 75;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 131;
        this.statChangeReqChance = true;
        this.StatChangeReq = 30;
        this.StatchangeEnemy = true;
        this.affectsPhysDef = true;
        this.MultChange = -1;
        this.changeTypeName = " defense ";
        this.makesContact = true;
    }
}
