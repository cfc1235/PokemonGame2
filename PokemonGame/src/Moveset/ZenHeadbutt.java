package Moveset;

import BattleMechanics.Moves;

public class ZenHeadbutt extends Moves {
    public ZenHeadbutt(){
        name = "Zen Headbutt";
        type = "Psychic";
        power = 80;
        acc = 90;
        PP = 15;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 169;
        canFlinch = true;
        FlinchChance = 20;
        makesContact = true;
    }
}
