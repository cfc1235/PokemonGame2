package Moveset.Water;

import BattleMechanics.Moves;

public class Scald extends Moves {
    public Scald(){
        this.name = "Scald";
        this.type = "Water";
        this.power = 80;
        this.acc = 100;
        this.PP = 15;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.canBurn = true;
        this.burnChance = 30;
        this.TMNum = 184;
    }
}
