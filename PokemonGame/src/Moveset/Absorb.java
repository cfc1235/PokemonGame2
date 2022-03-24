package Moveset;

import BattleMechanics.Moves;

public class Absorb extends Moves {

    public Absorb(){
        this.name = "Absorb";
        this.type = "Grass";
        this.power = 20;
        this.acc = 100;
        this.PP = 25;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.isSpecial = true;
        this.DamBackHeal = true;
        this.BackHealAm = .5;
    }
}
