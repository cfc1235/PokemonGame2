package Moveset;

import BattleMechanics.Moves;

public class Round extends Moves {
    public Round(){
        this.name = "Round";
        this.type = "Normal";
        this.power = 60;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.isSpecial = true;
        this.TMNum = 76;
    }
}
