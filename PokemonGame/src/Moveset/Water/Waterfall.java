package Moveset.Water;

import BattleMechanics.Moves;

public class Waterfall extends Moves {
    public Waterfall(){
        this.name = "Waterfall";
        this.type = "Water";
        this.power = 80;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 116;
        this.canFlinch = true;
        this.FlinchChance = 20;
        this.makesContact = true;
    }
}
