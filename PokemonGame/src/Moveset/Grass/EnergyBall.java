package Moveset.Grass;

import BattleMechanics.Moves;

public class EnergyBall extends Moves {
    public EnergyBall(){
        this.name = "Energy Ball";
        this.type = "Grass";
        this.power = 90;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.StatchangeEnemy = true;
        this.StatChangeReq = 10;
        this.statChangeReqChance = true;
        this.affectsSpecAtt = true;
        this.MultChange = -1;
        this.changeTypeName = " special attack";
        this.isSpecial = true;
        this.savedPP = this.PP;
        this.TMNum = 165;
    }
}
