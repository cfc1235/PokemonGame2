package Moveset;

import BattleMechanics.Moves;

public class BulletSeed extends Moves {
    public BulletSeed() {
        this.name = "Bullet Seed";
        this.type = "Grass";
        this.power = 25;
        this.acc = 100;
        this.PP = 30;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.MultHit = true;
        this.MinHit = 2;
        this.MaxHit = 5;
        this.savedPP = this.PP;
        this.TMNum = 50;
    }
}
