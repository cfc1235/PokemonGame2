package Moveset;

import BattleMechanics.Moves;

public class HyperFang extends Moves {

    public HyperFang(){
        name = "Hyper Fang";
        type = "Normal";
        power = 80;
        acc = 90;
        PP = 15;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        makesContact = true;
        canFlinch = true;
        FlinchChance = 10;
    }
}
