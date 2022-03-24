package Moveset;

import BattleMechanics.Moves;

public class LeechSeed extends Moves {
    public LeechSeed(){
        name = "Leech Seed";
        type = "Grass";
        PP = 10;
        acc = 90;
        canSeed = true;
        CanMiss = true;
        savedPP = PP;
    }
}
