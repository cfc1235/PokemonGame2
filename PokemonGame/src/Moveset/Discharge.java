package Moveset;

import BattleMechanics.Moves;

public class Discharge extends Moves {
    public Discharge(){
        this.name = "Discharge";
        this.type = "Electric";
        this.power = 80;
        this.acc = 100;
        this.PP = 15;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.canParalyze = true;
        this.paralysisChance = 30;
    }
}
