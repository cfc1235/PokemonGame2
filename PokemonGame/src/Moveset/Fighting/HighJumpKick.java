package Moveset.Fighting;

import BattleMechanics.Moves;

public class HighJumpKick extends Moves {
    public HighJumpKick(){
        this.name = "High Jump Kick";
        this.type = "Fighting";
        this.power = 130;
        this.acc = 90;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
        this.savedPP = this.PP;
    }
}
