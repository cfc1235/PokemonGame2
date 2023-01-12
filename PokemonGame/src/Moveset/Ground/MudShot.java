package Moveset.Ground;

import BattleMechanics.Moves;

public class MudShot extends Moves {
    public MudShot(){
        this.name = "Mud Shot";
        this.type = "Ground";
        this.power = 55;
        this.acc = 95;
        this.PP = 15;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.StatchangeEnemy = true;
        this.affectsSpeed = true;
        this.MultChange = -1;
        this.statChangeReqChance= true;
        this.StatChangeReq = 100;
        this.changeTypeName = " speed ";
        this.TMNum = 53;
    }
}
