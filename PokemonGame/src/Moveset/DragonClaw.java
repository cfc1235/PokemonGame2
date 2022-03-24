package Moveset;

import BattleMechanics.Moves;

public class DragonClaw extends Moves {
    public DragonClaw(){
        name = "Dragon Claw";
        type = "Dragon";
        power = 80;
        acc = 100;
        PP = 15;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 151;
        makesContact =true;
    }
}
