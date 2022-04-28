package Moveset.Water;

import BattleMechanics.Moves;

public class HydroPump extends Moves {
    public HydroPump(){
        this.name = "Hydro Pump";
        this.type = "Water";
        this.power = 110;
        this.acc = 80;
        this.PP = 5;
        this.isSpecial = true;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 103;
    }
}
