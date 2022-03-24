package Moveset;

import BattleMechanics.Moves;

public class GigaImpact extends Moves {
    public GigaImpact(){
        name = "Hyper Beam";
        type = "Normal";
        power = 150;
        acc = 90;
        PP = 5;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 9;
        makesContact = true;
        forcesSitOut = true;
    }
}
