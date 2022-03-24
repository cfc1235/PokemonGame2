package Moveset;

import BattleMechanics.Moves;

public class SecretPower extends Moves {

    public SecretPower(){
        this.name = "Secret Power";
        this.power = 70;
        this.PP = 20;
        this.savedPP = this.PP;
        this.CanMiss = true;
        this.acc = 100;
        this.TMNum = 94;
        this.statChangeReqChance = true;
        this.type = "Normal";
        this.sleepChance = .3;
        this.paralysisChance = .3;
        this.StatChangeReq = .3;
        this.freezeChance = .3;
        this.FlinchChance = 33;
        this.MultChange = -1;
        this.StatchangeEnemy = true;
        this.dealsDamage = true;
    }
}
