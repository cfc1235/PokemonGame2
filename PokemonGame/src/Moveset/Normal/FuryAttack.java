package Moveset.Normal;

import BattleMechanics.Moves;

public class FuryAttack extends Moves {
    public FuryAttack(){
        this.name = "Fury Attack";
        this.type = "Normal";
        this.power = 15;
        this.acc = 85;
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
