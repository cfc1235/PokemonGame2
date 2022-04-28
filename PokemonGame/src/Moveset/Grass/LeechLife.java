package Moveset.Grass;

import BattleMechanics.Moves;

public class LeechLife extends Moves {
    public LeechLife(){
        this.name = "Leech Life";
        this.type = "Bug";
        this.power = 80;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
        this.DamBackHeal = true;
        this.BackHealAm = .5;
        this.TMNum = 118;
    }
}
