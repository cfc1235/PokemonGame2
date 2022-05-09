package Moveset.Normal;

import BattleMechanics.Moves;

public class TriAttack extends Moves {
    public TriAttack(){
        this.name = "Tri Attack";
        this.type = "Normal";
        this.power = 80;
        this.acc = 100;
        this.PP = 10;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.canFreeze = true;
        this.canBurn = true;
        this.canParalyze = true;
        this.burnChance = 20;
        this.freezeChance = 20;
        this.paralysisChance = 20;
        this.TMNum = 119;
    }
}
