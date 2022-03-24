package Moveset;

import BattleMechanics.Moves;

public class Explosion extends Moves {
    public Explosion(){
        this.name = "Explosion";
        this.type = "Normal";
        this.power = 250;
        this.PP = 5;
        this.acc = 100;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.DamageSelf = true;
        this.recoil = 1;
        this.savedPP = this.PP;
        this.TMNum = 264;
    }
}
