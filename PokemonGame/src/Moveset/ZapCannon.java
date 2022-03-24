package Moveset;

import BattleMechanics.Moves;

public class ZapCannon extends Moves {
    public ZapCannon() {
        this.name = "Zap Cannon";
        this.PP = 5;
        this.savedPP = this.PP;
        this.type = "Electric";
        this.power = 120;
        this.dealsDamage = true;
        this.acc = 50;
        this.CanMiss = true;
        this.isSpecial = true;
        this.canParalyze = true;
        this.paralysisChance = 100;
    }
}