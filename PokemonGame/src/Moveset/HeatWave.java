package Moveset;

import BattleMechanics.Moves;

public class HeatWave extends Moves {
    public HeatWave(){
        name = "Heat Wave";
        type = "Fire";
        power = 95;
        acc = 90;
        PP = 10;
        savedPP = PP;
        dealsDamage = true;
        CanMiss = true;
        isSpecial = true;
        canBurn = true;
        burnChance = 10;
        TMNum = 136;
    }
}
