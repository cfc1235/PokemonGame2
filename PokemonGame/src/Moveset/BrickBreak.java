package Moveset;

import BattleMechanics.Moves;

public class BrickBreak extends Moves {
    public BrickBreak(){
        this.name = "Brick Break";
        this.type = "Fighting";
        this.power = 75;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 43;
        this.makesContact =true;
        this.breaksBarriers = true;
    }
}
