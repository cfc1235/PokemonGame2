package Moveset;

import BattleMechanics.Moves;

public class Thunderbolt extends Moves {

    public Thunderbolt(){
        this.TMNum = 24;
        this.type = "Electric";
        this.isSpecial = true;
        this.CanMiss = true;
        this.acc = 100;
        this.canParalyze = true;
        this.paralysisChance = 10;
        this.power = 90;
        this.PP = 15;
        this.savedPP = this.PP;
        this.name = "Thunderbolt";
    }
}
