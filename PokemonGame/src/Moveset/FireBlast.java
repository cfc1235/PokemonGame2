package Moveset;

import BattleMechanics.Moves;

public class FireBlast extends Moves {
    public FireBlast(){
        name = "Fire Blast";
        type = "Fire";
        power = 110;
        acc = 85;
        PP = 5;
        savedPP = PP;
        dealsDamage = true;
        CanMiss = true;
        isSpecial = true;
        canBurn = true;
        burnChance = 10;
        TMNum = 115;
    }
}
