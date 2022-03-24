package Moveset;

import BattleMechanics.Moves;

public class HydroPump extends Moves {
    public HydroPump(){
        name = "Hydro Pump";
        type = "Water";
        power = 110;
        acc = 80;
        PP = 5;
        isSpecial = true;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 103;
    }
}
