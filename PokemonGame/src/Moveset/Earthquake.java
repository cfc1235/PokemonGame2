package Moveset;

import BattleMechanics.Moves;

public class Earthquake extends Moves {
    public Earthquake(){
        name = "Earthquake";
        type = "Ground";
        power = 100;
        acc = 100;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 110;
    }
}
