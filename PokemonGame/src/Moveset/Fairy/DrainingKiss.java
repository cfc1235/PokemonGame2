package Moveset.Fairy;

import BattleMechanics.Moves;

public class DrainingKiss extends Moves {
    public DrainingKiss() {
        this.name = "Draining Kiss";
        this.type = "Fairy";
        this.power = 70;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 87;
        this.isSpecial = true;
        this.makesContact = true;
        this.DamBackHeal = true;
        this.BackHealAm = .5;
    }
}