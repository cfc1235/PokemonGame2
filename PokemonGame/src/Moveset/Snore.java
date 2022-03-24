package Moveset;

import BattleMechanics.Moves;

public class Snore extends Moves {
    public Snore(){
        this.name = "Snore";
        this.type = "Normal";
        this.power = 50;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.isSpecial = true;
        this.TMNum = 24;
    }
}
