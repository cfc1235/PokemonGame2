package Moveset;

import BattleMechanics.Moves;

public class HeatCrash extends Moves {
    public HeatCrash(){
        name = "Heat Crash";
        type = "Fire";
        acc = 100;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        makesContact = true;
        TMNum = 188;
    }
}
