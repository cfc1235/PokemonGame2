package Moveset;

import BattleMechanics.Moves;

public class ThunderFang extends Moves {
    public ThunderFang(){
        this.name = "Thunder Fang";
        this.type = "Electric";
        this.power = 65;
        this.acc = 95;
        this.PP = 15;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
        this.canParalyze = true;
        this.canFlinch = true;
        this.FlinchChance = 10;
        this.paralysisChance = 10;
    }
}
