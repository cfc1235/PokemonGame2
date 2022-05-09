package Moveset.Rock;

import BattleMechanics.Moves;

public class RockBlast extends Moves {
    public RockBlast(){
        this.name = "Rock Blast";
        this.type = "Rock";
        this.power = 25;
        this.acc = 90;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.MultHit = true;
        this.MinHit = 2;
        this.MaxHit = 5;
        this.savedPP = this.PP;
        this.TMNum = 54;
    }
}
