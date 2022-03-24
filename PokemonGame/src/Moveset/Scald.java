package Moveset;

import BattleMechanics.Moves;

public class Scald extends Moves {
    public Scald(){
        name = "Scald";
        type = "Water";
        power = 80;
        acc = 100;
        PP = 15;
        savedPP = PP;
        dealsDamage = true;
        CanMiss = true;
        isSpecial = true;
        canBurn = true;
        burnChance = 30;
        TMNum = 184;}
}
