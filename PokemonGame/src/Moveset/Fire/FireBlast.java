package Moveset.Fire;

import BattleMechanics.Moves;

public class FireBlast extends Moves {
    public FireBlast(){
        this.name = "Fire Blast";
        this.type = "Fire";
        this.power = 110;
        this.acc = 85;
        this.PP = 5;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.canBurn = true;
        this.burnChance = 10;
        this.TMNum = 115;
    }
}
