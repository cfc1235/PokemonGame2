package Moveset;

import BattleMechanics.Moves;

public class Facade extends Moves {
    public Facade(){
        name = "Facade";
        type = "Normal";
        power = 70;
        acc = 100;
        PP = 20;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 39;
        makesContact =true;
    }
}
