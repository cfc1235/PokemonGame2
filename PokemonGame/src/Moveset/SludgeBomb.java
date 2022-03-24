package Moveset;

import BattleMechanics.Moves;

public class SludgeBomb extends Moves {
    public SludgeBomb(){
        name = "Sludge Bomb";
        type = "Poison";
        power = 90;
        acc = 100;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        isSpecial = true;
        TMNum = 122;
        canPoison = true;
        poisonChance = 30;
    }
}
