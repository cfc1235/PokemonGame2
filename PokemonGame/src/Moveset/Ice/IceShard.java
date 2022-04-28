package Moveset.Ice;

import BattleMechanics.Moves;

public class IceShard extends Moves {
    public IceShard(){
        this.name = "Ice Shard";
        this.PP = 30;
        this.savedPP = this.PP;
        this.power = 40;
        this.acc = 100;
        this.CanMiss = true;
        this.dealsDamage = true;
        this.makesContact = true;
        this.type = "Ice";
        this.goesFirst = true;
    }
}
