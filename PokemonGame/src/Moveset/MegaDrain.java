package Moveset;

import BattleMechanics.Moves;

public class MegaDrain extends Moves {

    public MegaDrain(){
        this.name = "Mega Drain";
        this.type = "Grass";
        this.power = 40;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.isSpecial = true;
        this.DamBackHeal = true;
        this.BackHealAm = .5;
    }
}
