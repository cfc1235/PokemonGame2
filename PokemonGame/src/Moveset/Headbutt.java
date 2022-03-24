package Moveset;

import BattleMechanics.Moves;

public class Headbutt extends Moves {
    public Headbutt(){
        this.name = "Headbutt";
        this.type = "Normal";
        this.power = 70;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.canFlinch = true;
        this.FlinchChance = 30;
        this.makesContact = true;
    }
}
