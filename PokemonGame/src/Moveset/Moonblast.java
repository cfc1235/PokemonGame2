package Moveset;

import BattleMechanics.Moves;

public class Moonblast extends Moves {

    public Moonblast(){
        this.name = "Moonblast";
        this.type =  "Fairy";
        this.isSpecial = true;
        this.power = 95;
        this.CanMiss = true;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage =true;
        this.savedPP = this.PP;
        this.statChangeReqChance = true;
        this.StatChangeReq = 30;
        this.StatchangeEnemy = true;
        this.affectsSpecAtt = true;
        this.MultChange = -1;
        this.changeTypeName = " special attack ";
    }
}
