package Moveset.Water;

import BattleMechanics.Moves;

public class WaterGun extends Moves {
    public WaterGun() {
        this.name = "Water Gun";
        this.type = "Water";
        this.power = 40;
        this.acc = 100;
        this.PP = 25;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.savedPP = this.PP;
    }
}

