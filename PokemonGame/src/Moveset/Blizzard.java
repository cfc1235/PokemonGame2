package Moveset;

import BattleMechanics.Moves;

public class Blizzard extends Moves {
    public Blizzard(){
        name = "Blizzard";
        type = "Ice";
        power = 110;
        acc = 70;
        PP = 5;
        isSpecial = true;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 106;
        canFreeze = true;
        freezeChance = 10;
    }
}
