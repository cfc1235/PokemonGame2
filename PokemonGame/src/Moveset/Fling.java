package Moveset;

import BattleMechanics.Moves;

public class Fling extends Moves {
    public Fling(){
        name = "Fling";
        type = "Dark";
        acc = 100;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 59;
    }
}
