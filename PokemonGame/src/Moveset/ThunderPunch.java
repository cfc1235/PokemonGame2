package Moveset;

import BattleMechanics.Moves;

public class ThunderPunch extends Moves {
    public ThunderPunch(){
        this.name = "Thunder Punch";
        this.type = "Electric";
        this.power = 75;
        this.acc = 100;
        this.PP = 15;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
        this.canParalyze = true;
        this.paralysisChance = 10;
        this.TMNum = 5;
    }
}
