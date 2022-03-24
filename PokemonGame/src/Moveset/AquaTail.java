package Moveset;

import BattleMechanics.Moves;

public class AquaTail extends Moves{
    public AquaTail(){
        name = "Aqua Tail";
        type = "Water";
        power = 90;
        PP = 10;
        acc = 90;
        dealsDamage = true;
        CanMiss = true;
        makesContact = true;
    }
}
