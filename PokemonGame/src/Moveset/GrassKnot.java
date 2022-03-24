package Moveset;

import BattleMechanics.Moves;

public class GrassKnot extends Moves {
    public GrassKnot(){
        name = "Grass Knot";
        type = "Grass";
        acc = 100;
        PP = 20;
        isSpecial = true;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        makesContact = true;
        TMNum = 177;
    }
}
