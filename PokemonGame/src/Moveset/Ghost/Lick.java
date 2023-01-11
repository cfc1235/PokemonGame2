package Moveset.Ghost;

import BattleMechanics.Moves;

public class Lick extends Moves {
    public Lick(){
        this.name = "Lick";
        this.type = "Ghost";
        this.power = 30;
        this.acc = 100;
        this.PP = 30;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
        this.canParalyze = true;
        this.paralysisChance = 30;
    }
}
