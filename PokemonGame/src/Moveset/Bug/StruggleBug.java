package Moveset.Bug;

import BattleMechanics.Moves;

public class StruggleBug extends Moves {

    public StruggleBug(){
        this.name = "Struggle Bug";
        this.type = "Bug";
        this.isSpecial = true;
        this.dealsDamage = true;
        this.power = 50;
        this.acc = 100;
        this.CanMiss = true;
        this.PP = 20;
        this.savedPP = this.PP;
        this.StatchangeEnemy = true;
        this.affectsSpecAtt = true;
        this.MultChange = -1;
        this.changeTypeName = " special attack ";
    }
}
