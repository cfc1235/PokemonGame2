package Moveset.Dragon;

import BattleMechanics.Moves;

public class DragonBreath extends Moves {
    public DragonBreath(){
        this.name = "Dragon Breath";
        this.type = "Dragon";
        this.power = 60;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.canParalyze = true;
        this.paralysisChance = 30;
        this.isSpecial = true;
    }
}
