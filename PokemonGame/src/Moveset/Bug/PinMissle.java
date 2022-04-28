package Moveset.Bug;

import BattleMechanics.Moves;

public class PinMissle extends Moves {
    public PinMissle(){
        this.name = "Pin Missile";
        this.type = "Bug";
        this.power = 25;
        this.acc = 95;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.MultHit = true;
        this.MinHit = 2;
        this.MaxHit = 5;
        this.savedPP = this.PP;
        this.TMNum = 7;
    }
}
