package Moveset;

import BattleMechanics.Moves;

public class DreamEater extends Moves {

    public DreamEater(){
        this.name = "Dream Eater";
        this.PP = 15;
        this.savedPP = this.PP;
        this.type = "Psychic";
        this.power = 100;
        this.isSpecial = true;
        this.acc = 100;
        this.CanMiss = true;
        this.DamBackHeal = true;
        this.BackHealAm = .5;
        this.dealsDamage = true;
    }
}
