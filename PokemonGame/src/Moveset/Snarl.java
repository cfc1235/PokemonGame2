package Moveset;

import BattleMechanics.Moves;

public class Snarl extends Moves {

    public Snarl(){
        this.name = "Snarl";
        this.type = "Dark";
        this.power = 55;
        this.acc = 95;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 95;
        this.StatchangeEnemy = true;
        this.affectsSpecAtt = true;
        this.MultChange = -1;
        this.changeTypeName = " special attack ";
        this.isSpecial = true;
    }
}
