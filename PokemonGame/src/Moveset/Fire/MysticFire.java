package Moveset.Fire;

import BattleMechanics.Moves;

public class MysticFire extends Moves {
    public MysticFire(){
        this.name = "Mystic Fire";
        this.type = "Fire";
        this.power = 75;
        this.acc = 100;
        this.PP = 10;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.StatchangeEnemy = true;
        this.affectsSpecAtt = true;
        this.MultChange = -1;
        this.statChangeReqChance= true;
        this.StatChangeReq = 100;
        this.changeTypeName = "special attack ";
        this.TMNum = 92;
    }
}
