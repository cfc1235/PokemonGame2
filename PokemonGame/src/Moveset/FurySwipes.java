package Moveset;

import BattleMechanics.Moves;

public class FurySwipes extends Moves {
    public FurySwipes(){
        this.name = "Fury Swipes";
        this.type = "Normal";
        this.power = 18;
        this.acc = 80;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.MultHit = true;
        this.MinHit = 2;
        this.MaxHit = 5;
        this.savedPP = this.PP;
        this.makesContact = true;
    }
}
