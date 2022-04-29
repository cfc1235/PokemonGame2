package Moveset.Dragon;

import BattleMechanics.Moves;

public class DragonTail extends Moves {
    public DragonTail(){
        this.whirlwindEffect = true;
        this.name = "Dragon Tail";
        this.type = "Dragon";
        this.power = 60;
        this.acc = 90;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact =true;
        this.speedPriority = -6;
    }
}
