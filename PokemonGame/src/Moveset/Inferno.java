package Moveset;

import BattleMechanics.Moves;

public class Inferno extends Moves {
    public Inferno(){
        name = "Inferno";
        type = "Fire";
        power = 100;
        acc = 50;
        PP = 5;
        savedPP = PP;
        dealsDamage = true;
        CanMiss = true;
        isSpecial = true;
        canBurn = true;
        burnChance = 100;
    }
}
