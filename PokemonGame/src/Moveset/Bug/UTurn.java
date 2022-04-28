package Moveset.Bug;

import BattleMechanics.Moves;

public class UTurn extends Moves {
    public UTurn(){
        this.name = "U-Turn";
        this.type = "Bug";
        this.power = 70;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 56;
        this.makesContact =true;
        this.selfWhirlwindEffect = true;
    }
}
