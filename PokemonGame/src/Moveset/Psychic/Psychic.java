package Moveset.Psychic;

import BattleMechanics.Moves;

public class Psychic extends Moves {
    public Psychic(){
        this.name = "Psychic";
        this.type = "Psychic";
        this.power = 90;
        this.acc = 100;
        this.PP = 19;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP =  this.PP;
        this.TMNum = 111;
        this.statChangeReqChance = true;
        this.StatChangeReq = 10;
        this.StatchangeEnemy = true;
        this.affectsSpecDef = true;
        this.MultChange = -1;
        this.changeTypeName = " special defense ";
        this.isSpecial = true;
    }
}
