package Moveset.Ground;

import BattleMechanics.Moves;

public class EarthPower extends Moves {
    public EarthPower(){
        this.name = "Earth Power";
        this.type = "Ground";
        this.power = 90;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 167;
        this.statChangeReqChance = true;
        this.StatChangeReq = 10;
        this.StatchangeEnemy = true;
        this.affectsSpecDef = true;
        this.MultChange = -1;
        this.changeTypeName = "special defense ";
    }
}
