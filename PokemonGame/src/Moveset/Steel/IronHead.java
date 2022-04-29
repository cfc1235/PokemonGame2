package Moveset.Steel;

import BattleMechanics.Moves;

public class IronHead extends Moves {
    public IronHead(){
        this.name = "Iron Head";
        this.type = "Steel";
        this.power = 80;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 174;
        this.canFlinch = true;
        this.FlinchChance = 30;
        this.makesContact = true;
    }
}
