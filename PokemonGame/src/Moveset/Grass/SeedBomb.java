package Moveset.Grass;

import BattleMechanics.Moves;

public class SeedBomb extends Moves {
    public SeedBomb() {
        this.name = "Seed Bomb";
        this.type = "Grass";
        this.power = 80;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 159;
    }
}
