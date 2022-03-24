package Moveset;

import BattleMechanics.Moves;

public class BeatUp extends Moves {
    public BeatUp(){
        name = "Beat Up";
        type = "Dark";
        acc = 100;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 37;
    }
}
