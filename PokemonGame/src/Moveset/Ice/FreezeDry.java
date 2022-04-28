package Moveset.Ice;

import Moveset.Heal.Moonlight;

public class FreezeDry extends Moonlight {
    public FreezeDry(){
        this.name = "Freeze-Dry";
        this.type = "Ice";
        this.power = 70;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.isSpecial = true;
        this.canFreeze = true;
        this.freezeChance = 10;
    }
}
