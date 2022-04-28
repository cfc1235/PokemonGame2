package Moveset.Normal;

import BattleMechanics.Moves;

public class BodySlam extends Moves {
    public BodySlam(){
        this.name = "Body Slam";
        this.type = "Normal";
        this.power = 85;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
        this.canParalyze = true;
        this.paralysisChance = 30;
        this.TMNum = 101;
    }
}
