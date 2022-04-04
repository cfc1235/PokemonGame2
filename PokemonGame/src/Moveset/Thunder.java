package Moveset;

import BattleMechanics.Moves;

public class Thunder extends Moves {

    public Thunder(){
        this.TMNum = 25;
        this.name = "Thunder";
        this.type = "Electric";
        this.PP = 10;
        this.CanMiss = true;
        this.acc = 70;
        this.canParalyze = true;
        this.paralysisChance = 30;
        this.power = 110;
        this.isSpecial = true;
    }
}