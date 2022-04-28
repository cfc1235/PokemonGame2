package Moveset.Steel;

import BattleMechanics.Moves;

public class FlashCannon extends Moves {
    public FlashCannon(){
        this.name = "Flash Cannon";
        this.type = "Steel";
        this.power = 80;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.StatchangeEnemy = true;
        this.StatChangeReq = 10;
        this.statChangeReqChance = true;
        this.affectsSpecDef = true;
        this.MultChange = -1;
        this.changeTypeName = " special defense ";
        this.isSpecial = true;
        this.savedPP = this.PP;
        this.TMNum = 170;
    }
}
