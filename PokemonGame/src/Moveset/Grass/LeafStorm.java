package Moveset.Grass;

import BattleMechanics.Moves;

public class LeafStorm extends Moves {
    public LeafStorm(){
        this.name = "Leaf Storm";
        this.type = "Grass";
        this.power = 130;
        this.acc = 90;
        this.PP = 5;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.StateChangeAlly = true;
        this.StatChangeReq = 100;
        this.statChangeReqChance = true;
        this.affectsSpecAtt = true;
        this.MultChange = -2;
        this.changeTypeName = " special attack harshly ";
        this.isSpecial = true;
        this.savedPP = this.PP;
        this.TMNum = 171;
    }
}
