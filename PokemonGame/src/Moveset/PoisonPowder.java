package Moveset;

import BattleMechanics.Moves;

public class PoisonPowder extends Moves {
    public PoisonPowder() {
        name = "Poison Powder";
        type = "Poison";
        PP = 35;
        acc = 75;
        onlyCanPoison = true;
        CanMiss = true;
        savedPP = PP;
    }
}
