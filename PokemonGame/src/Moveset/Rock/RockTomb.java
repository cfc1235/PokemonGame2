package Moveset.Rock;

import BattleMechanics.Moves;

public class RockTomb extends Moves {
    public RockTomb(){
        this.name = "Rock Tomb";
        this.type = "Rock";
        this.power = 60;
        this.acc = 95;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 48;
        this.statChangeReqChance = true;
        this.StatChangeReq = 100;
        this.StatchangeEnemy = true;
        this.affectsSpeed = true;
        this.MultChange = -1;
        this.changeTypeName = "speed ";
    }
}
