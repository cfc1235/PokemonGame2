package Moveset;

import BattleMechanics.Moves;

public class FalseSwipe extends Moves {
    public FalseSwipe() {
        name = "False Swipe";
        type = "Normal";
        power = 40;
        acc = 100;
        PP = 40;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 94;
        makesContact = true;
    }
}
