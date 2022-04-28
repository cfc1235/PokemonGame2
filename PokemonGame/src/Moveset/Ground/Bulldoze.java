package Moveset.Ground;

import BattleMechanics.Moves;

public class Bulldoze extends Moves {
    public Bulldoze(){
        this.name = "Bulldoze";
        this.type = "Ground";
        this.power = 60;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.statChangeReqChance = true;
        this.StatChangeReq = 100;
        this.StatchangeEnemy = true;
        this.affectsSpeed = true;
        this.MultChange = -1;
        this.changeTypeName = "speed ";
        this.TMNum = 81;
    }
}
