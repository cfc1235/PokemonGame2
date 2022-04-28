package Moveset.Flying;

import BattleMechanics.Moves;

public class Hurricane extends Moves {
    public Hurricane(){
        this.name = "Hurricane";
        this.type = "Flying";
        this.power = 110;
        this.acc = 70;
        this.PP = 10;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.canConfuse = true;
        this.confuseChance = 30;
        this.TMNum = 189;
    }
}
