package Moveset;

import BattleMechanics.Moves;

public class PowerWhip extends Moves {
    public PowerWhip() {
        name = "Power Whip";
        type = "Grass";
        power = 120;
        acc = 85;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        makesContact = true;
        TMNum = 172;
    }
}
