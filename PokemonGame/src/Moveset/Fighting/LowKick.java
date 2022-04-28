package Moveset.Fighting;

import BattleMechanics.Moves;

public class LowKick extends Moves {
    public LowKick(){
        this.name = "Low Kick";
        this.type = "Fighting";
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
        this.TMNum = 107;
    }
}
