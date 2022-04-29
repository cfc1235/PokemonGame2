package Moveset.Ghost;

import BattleMechanics.Moves;

public class Hex extends Moves {
    public Hex(){
        this.name = "Hex";
        this.type = "Ghost";
        this.power = 65;
        this.acc = 100;
        this.PP = 10;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.TMNum = 77;
    }
}
