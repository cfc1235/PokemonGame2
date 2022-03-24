package Moveset;

import BattleMechanics.Moves;

public class Spark extends Moves {
    public Spark(){
        this.name = "Spark";
        this.type = "Electric";
        this.power = 65;
        this.acc = 100;
        this.PP = 20;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
        this.canParalyze = true;
        this.paralysisChance = 30;
    }
}
