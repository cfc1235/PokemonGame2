package Moveset;

import BattleMechanics.Moves;

public class BodyPress extends Moves {
    public BodyPress(){
        name = "Body Press";
        type = "Fighting";
        power = 80;
        acc = 100;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 199;
        makesContact =true;
    }
}
