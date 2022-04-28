package Moveset.Ice;

import BattleMechanics.Moves;

public class IcePunch extends Moves {
    public IcePunch(){
        this.name = "Ice Punch";
        this.type = "Ice";
        this.power = 75;
        this.acc = 100;
        this.PP = 15;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
        this.canFreeze = true;
        this.freezeChance = 10;
        this.TMNum = 4;
    }
}
