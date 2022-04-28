package Moveset.Ice;

import BattleMechanics.Moves;

public class IceFang extends Moves {
    public IceFang(){
        this.name = "Ice Fang";
        this.type = "Ice";
        this.power = 65;
        this.acc = 95;
        this.PP = 15;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
        this.canFreeze = true;
        this.canFlinch = true;
        this.FlinchChance = 10;
        this.freezeChance = 10;
        this.TMNum = 67;
    }
}
