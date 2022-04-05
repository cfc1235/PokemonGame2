package Moveset;

import BattleMechanics.Moves;

public class BraveBird extends Moves {
    public BraveBird(){
        this.name = "Brave Bird";
        this.type = "Flying";
        this.power = 120;
        this.PP = 15;
        this.acc = 100;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.DamageSelf = true;
        this.recoil = .33;
        this.savedPP = this.PP;
        this.TMNum = 166;
    }
}
