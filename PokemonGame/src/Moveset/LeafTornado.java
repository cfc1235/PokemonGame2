package Moveset;

import BattleMechanics.Moves;

public class LeafTornado extends Moves {
    public LeafTornado(){
        this.name = "Leaf Tornado";
        this.type = "Grass";
        this.power = 65;
        this.acc = 90;
        this.PP = 10;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.StatchangeEnemy = true;
        this.affectsAcc = true;
        this.MultChange = -1;
        this.changeTypeName = " accuracy ";
        this.statChangeReqChance = true;
        this.StatChangeReq = .5;
    }
}
