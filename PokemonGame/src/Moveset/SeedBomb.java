package Moveset;

import BattleMechanics.Moves;

public class SeedBomb extends Moves {
    public SeedBomb() {
        name = "Seed Bomb";
        type = "Grass";
        power = 80;
        acc = 100;
        PP = 15;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 159;
    }
}
