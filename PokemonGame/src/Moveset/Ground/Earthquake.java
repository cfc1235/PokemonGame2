package Moveset.Ground;

import BattleMechanics.Moves;

public class Earthquake extends Moves {
    public Earthquake(){
        this.name = "Earthquake";
        this.type = "Ground";
        this.power = 100;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 110;
    }
}
