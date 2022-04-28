package Moveset.Grass;

import BattleMechanics.Moves;

public class GigaDrain extends Moves {
    public GigaDrain(){
        this.name = "Giga Drain";
        this.type = "Grass";
        this.power = 75;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.DamBackHeal = true;
        this.BackHealAm = .5;
        this.isSpecial = true;
        this.TMNum = 28;
    }
}
