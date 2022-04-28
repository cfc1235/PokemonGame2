package Moveset.Grass;

import BattleMechanics.Moves;

public class VineWhip extends Moves {
    public VineWhip(){
        this.name = "Vine Whip";
        this.type = "Grass";
        this.power = 45;
        this.acc = 100;
        this.PP = 25;
        this.dealsDamage = true;
        this.savedPP = this.PP;
    }
}
