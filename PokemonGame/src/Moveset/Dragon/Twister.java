package Moveset.Dragon;

import BattleMechanics.Moves;

public class Twister extends Moves {

    public Twister(){
        this.name = "Twister";
        this.type = "Dragon";
        this.isSpecial = true;
        this.PP = 20;
        this.canFlinch = true;
        this.FlinchChance = 20;
        this.savedPP = this.PP;
        this.power = 40;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.acc = 100;
    }
}
