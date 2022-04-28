package Moveset.Ice;

import BattleMechanics.Moves;

public class IcyWind extends Moves {
    public IcyWind(){
        this.name = "Icy Wind";
        this.type = "Ice";
        this.power = 55;
        this.acc = 95;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.StatchangeEnemy = true;
        this.StatChangeReq = 100;
        this.statChangeReqChance = true;
        this.affectsSpeed = true;
        this.MultChange = -1;
        this.changeTypeName = " speed ";
        this.isSpecial = true;
        this.savedPP = this.PP;
        this.TMNum = 27;
    }
}
