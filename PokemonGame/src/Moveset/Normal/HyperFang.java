package Moveset.Normal;

import BattleMechanics.Moves;

public class HyperFang extends Moves {

    public HyperFang(){
        this.name = "Hyper Fang";
        this.type = "Normal";
        this.power = 80;
        this.acc = 90;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
        this.canFlinch = true;
        this.FlinchChance = 10;
    }
}
