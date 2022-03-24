package Moveset;

import BattleMechanics.Moves;

public class Pound extends Moves {

    public Pound() {
        name = "Pound";
        type = "Normal";
        power = 35;
        acc = 100;
        PP = 40;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        makesContact = true;
    }
}


