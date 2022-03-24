package Moveset;

import BattleMechanics.Moves;

public class Round extends Moves {
    public Round(){
        name = "Round";
        type = "Normal";
        power = 60;
        acc = 100;
        PP = 15;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        isSpecial = true;
        TMNum = 76;
    }
}
