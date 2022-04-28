package Moveset.Normal;

import BattleMechanics.Moves;

public class Scratch extends Moves {
    public Scratch() {
        name = "Scratch";
        type = "Normal";
        power = 40;
        acc = 100;
        PP = 35;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        makesContact = true;
    }
}
