package Moveset.Dragon;

import BattleMechanics.Moves;

public class DragonClaw extends Moves {
    public DragonClaw(){
        this.name = "Dragon Claw";
        this.type = "Dragon";
        this.power = 80;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 147;
        this.makesContact =true;
    }
}
