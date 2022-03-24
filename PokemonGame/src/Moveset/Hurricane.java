package Moveset;

import BattleMechanics.Moves;

public class Hurricane extends Moves {
    public Hurricane(){
        name = "Hurricane";
        type = "Flying";
        power = 110;
        acc = 70;
        PP = 10;
        savedPP = PP;
        dealsDamage = true;
        CanMiss = true;
        isSpecial = true;
        canConfuse = true;
        confuseChance = 30;
        TMNum = 189;
    }
}
