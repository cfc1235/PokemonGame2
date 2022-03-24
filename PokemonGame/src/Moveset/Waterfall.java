package Moveset;

import BattleMechanics.Moves;

public class Waterfall extends Moves {
    public Waterfall(){
        name = "Waterfall";
        type = "Water";
        power = 80;
        acc = 100;
        PP = 15;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 116;
        canFlinch = true;
        FlinchChance = 20;
        makesContact = true;
    }
}
