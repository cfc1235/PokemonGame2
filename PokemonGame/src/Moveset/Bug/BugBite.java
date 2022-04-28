package Moveset.Bug;

import BattleMechanics.Moves;

public class BugBite extends Moves {
    public BugBite(){
        this.name = "Bug Bite";
        this.type = "Bug";
        this.power = 60;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact =true;
        this.usesBerry = true;
    }
}
