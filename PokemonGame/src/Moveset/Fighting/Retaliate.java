package Moveset.Fighting;

import BattleMechanics.Moves;

public class Retaliate extends Moves {
    public Retaliate(){
        this.name = "Retaliate";
        this.type = "Fighting";
        this.power = 70;
        this.acc = 100;
        this.PP = 5;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 79;
        this.makesContact =true;
    }
}
