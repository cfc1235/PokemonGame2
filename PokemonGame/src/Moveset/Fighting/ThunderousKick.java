package Moveset.Fighting;

import BattleMechanics.Moves;

public class ThunderousKick extends Moves {
    public ThunderousKick(){
        this.name = "Thunderous Kick";
        this.type = "Fighting";
        this.power = 90;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.statChangeReqChance = true;
        this.StatChangeReq = 100;
        this.StatchangeEnemy = true;
        this.affectsPhysDef = true;
        this.MultChange = -1;
        this.changeTypeName = " defense ";
        this.makesContact = true;
    }
}
