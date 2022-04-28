package Moveset.Dragon;

import BattleMechanics.Moves;

public class BreakingSwing extends Moves {
    public BreakingSwing(){
        this.name = "Breaking Swing";
        this.type = "Dragon";
        this.power = 60;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 99;
        this.statChangeReqChance = true;
        this. StatChangeReq = 100;
        this.StatchangeEnemy = true;
        this.affectsPhysAtt = true;
        this.MultChange = -1;
        this.changeTypeName = "attack ";
    }
}
