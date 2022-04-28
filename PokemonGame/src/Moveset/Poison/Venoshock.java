package Moveset.Poison;

import BattleMechanics.Moves;

public class Venoshock extends Moves {
    public Venoshock(){
        this.name = "Venoshock";
        this.type = "Poison";
        this.power = 65;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.isSpecial = true;
        this.TMNum = 74;
    }
}
