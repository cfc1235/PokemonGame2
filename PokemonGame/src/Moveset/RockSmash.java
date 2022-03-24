package Moveset;

import BattleMechanics.Moves;

public class RockSmash extends Moves {

    public RockSmash(){
        this.name = "Rock Smash";
        this.type = "Fighting";
        this.makesContact = true;
        this.power = 40;
        this.CanMiss = true;
        this.acc = 100;
        this.PP = 15;
        this.savedPP = this.PP;
        this.StatchangeEnemy = true;
        this.StatChangeReq = 50;
        this.statChangeReqChance = true;
        this.affectsPhysDef = true;
        this.MultChange = -1;
        this.changeTypeName = " defense";
        this.TMNum = 98;
        this.dealsDamage = true;
    }
}
