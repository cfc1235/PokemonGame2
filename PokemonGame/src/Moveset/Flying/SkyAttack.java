package Moveset.Flying;

import BattleMechanics.Moves;

public class SkyAttack extends Moves {
    public SkyAttack(){
        this.name = "Sky Attack";
        this.turnLength = 2;
        this.type = "Flying";
        this.dealsDamage = true;
        this.power = 140;
        this.acc = 90;
        this.CanMiss = true;
        this.canFlinch = true;
        this.FlinchChance = 30;
        this.PP = 5;
        this.savedPP = this.PP;
    }
}
