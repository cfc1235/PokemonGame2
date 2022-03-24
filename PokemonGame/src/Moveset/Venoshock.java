package Moveset;

import BattleMechanics.Moves;

public class Venoshock extends Moves {
    public Venoshock(){
        name = "Venoshock";
        type = "Poison";
        power = 65;
        acc = 100;
        PP = 15;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        isSpecial = true;
        TMNum = 74;
    }
}
