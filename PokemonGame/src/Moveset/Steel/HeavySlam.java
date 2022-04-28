package Moveset.Steel;

import BattleMechanics.Moves;

public class HeavySlam extends Moves {
    public HeavySlam(){
        this.name = "Heavy Slam";
        this.type = "Steel";
        this.makesContact = true;
        this.PP = 10;
        this.savedPP = this.PP;
        this.acc = 100;
        this.CanMiss = true;
        this.dealsDamage = true;
        this.TMNum = 179;
    }
}
