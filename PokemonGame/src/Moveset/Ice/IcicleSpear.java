package Moveset.Ice;

import BattleMechanics.Moves;

public class IcicleSpear extends Moves {
    public IcicleSpear(){
        this.name = "Icicle Spear";
        this.type = "Ice";
        this.power = 25;
        this.acc = 100;
        this.PP = 30;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.MultHit = true;
        this.MinHit = 2;
        this.MaxHit = 5;
        this.savedPP = this.PP;
        this.TMNum = 51;
    }
}
