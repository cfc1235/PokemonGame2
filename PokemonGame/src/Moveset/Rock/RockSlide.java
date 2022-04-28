package Moveset.Rock;

import BattleMechanics.Moves;

public class RockSlide extends Moves {
    public RockSlide(){
        this.name = "Rock Slide";
        this.type = "Rock";
        this.power = 75;
        this.acc = 90;
        this.PP = 10;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.canFlinch = true;
        this.FlinchChance = 30;
        this.TMNum = 22;
    }
}
