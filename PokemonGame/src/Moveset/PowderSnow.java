package Moveset;

import BattleMechanics.Moves;

public class PowderSnow extends Moves {
    public PowderSnow(){
        this.name = "Powder Snow";
        this.type = "Ice";
        this.power = 40;
        this.acc = 100;
        this.PP = 25;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.canFreeze = true;
        this.freezeChance = 10;
    }
}
