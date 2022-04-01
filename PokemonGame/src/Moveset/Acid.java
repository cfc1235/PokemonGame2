package Moveset;

import BattleMechanics.Moves;

public class Acid extends Moves {
    public Acid(){
        this.name = "Acid";
        this.type = "Poison";
        this.power = 40;
        this.acc = 100;
        this.PP = 30;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.statChangeReqChance = true;
        this.StatChangeReq = 10;
        this.StatchangeEnemy = true;
        this.affectsSpecDef = true;
        this.MultChange = -1;
        this.changeTypeName = " special defense ";
        this.isSpecial = true;
    }
}
