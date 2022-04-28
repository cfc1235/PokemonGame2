package Moveset.Flying;

import BattleMechanics.Moves;

public class AirSlash extends Moves {
    public AirSlash(){
        this.name = "Air Slash";
        this.type = "Flying";
        this.power = 75;
        this.acc = 95;
        this.PP = 15;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.canFlinch = true;
        this.FlinchChance = 30;
        this.TMNum = 95;
    }
}
