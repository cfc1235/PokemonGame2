package Moveset;

import BattleMechanics.Moves;

public class ThunderShock extends Moves {
    public ThunderShock(){
        this.name = "Thunder Shock";
        this.type = "Electric";
        this.power = 40;
        this.acc = 100;
        this.PP = 30;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.canParalyze = true;
        this.paralysisChance = 10;
    }
}
