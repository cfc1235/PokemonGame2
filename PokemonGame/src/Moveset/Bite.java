package Moveset;

import BattleMechanics.Moves;

public class Bite extends Moves {
    public Bite(){
        this.name = "Bite";
        this.type = "Dark";
        this.power = 60;
        this.acc = 100;
        this.PP = 25;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 132;
        this.canFlinch = true;
        this.FlinchChance = 30;
        this.makesContact = true;
    }
}
