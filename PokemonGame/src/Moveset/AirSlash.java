package Moveset;

import BattleMechanics.Moves;

public class AirSlash extends Moves {
    public AirSlash(){
        name = "Air Slash";
        type = "Flying";
        power = 75;
        acc = 95;
        PP = 15;
        savedPP = PP;
        dealsDamage = true;
        CanMiss = true;
        isSpecial = true;
        canFlinch = true;
        FlinchChance = 30;
        TMNum = 95;
    }
}
