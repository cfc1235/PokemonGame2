package Moveset;

import BattleMechanics.Moves;

public class ShadowBall extends Moves {
    public ShadowBall(){
        this.name = "Shadow Ball";
        this.type = "Ghost";
        this.power = 80;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 133;
        this.statChangeReqChance = true;
        this.StatChangeReq = 20;
        this.StatchangeEnemy = true;
        this.affectsSpecDef = true;
        this.MultChange = -1;
        this.changeTypeName = " special defense ";
        this.isSpecial = true;
    }
}
