package Moveset;

import BattleMechanics.Moves;

public class CrossPoison extends Moves {

    public CrossPoison(){
        this.name = "Cross Poison";
        this.type = "Poison";
        this.power = 70;
        this.acc = 100;
        this.PP = 20;
        this.savedPP = this.PP;
        this.canPoison = true;
        this.poisonChance = 10;
        this.makesContact = true;
        this.dealsDamage = true;
        this.Critnum = 1;
        this.affectsCrit = true;
        this.CanMiss = true;
    }
}
