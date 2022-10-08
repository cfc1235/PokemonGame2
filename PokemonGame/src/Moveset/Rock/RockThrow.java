package Moveset.Rock;

import BattleMechanics.Moves;

public class RockThrow extends Moves {
    public RockThrow(){
        this.name = "Rock Throw";
        this.type = "Rock";
        this.power = 50;
        this.acc = 90;
        this.PP = 15;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
    }
}
