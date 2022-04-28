package Moveset.Fire;

import BattleMechanics.Moves;

public class HeatCrash extends Moves {
    public HeatCrash(){
        this.name = "Heat Crash";
        this.type = "Fire";
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
        this.TMNum = 188;
    }
}
