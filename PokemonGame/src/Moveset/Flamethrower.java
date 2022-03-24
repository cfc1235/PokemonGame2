package Moveset;

import BattleMechanics.Moves;

public class Flamethrower extends Moves {
    public Flamethrower(){
        name = "Flamethrower";
        type = "Fire";
        power = 90;
        acc = 100;
        PP = 15;
        savedPP = PP;
        dealsDamage = true;
        CanMiss = true;
        isSpecial = true;
        canBurn = true;
        burnChance = 10;
        TMNum = 102;
    }
}
