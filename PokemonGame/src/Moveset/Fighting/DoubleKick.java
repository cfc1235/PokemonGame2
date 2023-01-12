package Moveset.Fighting;

import BattleMechanics.Moves;

public class DoubleKick extends Moves {
    public DoubleKick(){
        this.name = "Double Kick";
        this.type = "Fighting";
        this.power = 30;
        this.acc = 100;
        this.PP = 30;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.MultHit = true;
        this.MinHit = 2;
        this.MaxHit = 2;
        this.savedPP = this.PP;
    }
}
