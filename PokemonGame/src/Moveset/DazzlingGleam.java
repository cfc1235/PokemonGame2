package Moveset;

import BattleMechanics.Moves;

public class DazzlingGleam extends Moves {
    public DazzlingGleam(){
        this.name = "Dazzling Gleam";
        this.type = "Fairy";
        this.power = 80;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 192;
        this.isSpecial = true;
    }
}
