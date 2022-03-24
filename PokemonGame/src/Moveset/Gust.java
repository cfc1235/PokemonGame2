package Moveset;

import BattleMechanics.Moves;

public class Gust extends Moves {
    public Gust(){
        name = "Gust";
        type = "Flying";
        power = 40;
        acc = 100;
        PP = 35;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        isSpecial =true;
    }
}
