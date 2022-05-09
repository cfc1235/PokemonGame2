package Moveset.Bug;

import BattleMechanics.Moves;

public class FuryCutter extends Moves {
    public FuryCutter(){
        this.name = "Fury Cutter";
        this.type = "Bug";
        this.power = 40;
        this.acc = 95;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.MultHit = true;
        this.MinHit = 2;
        this.MaxHit = 5;
        this.savedPP = this.PP;
        this.makesContact = true;
    }
}
