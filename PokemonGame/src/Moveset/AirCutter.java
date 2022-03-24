package Moveset;

import BattleMechanics.Moves;

public class AirCutter extends Moves {
    public AirCutter(){
        this.name = "Air Cutter";
        this.type = "Flying";
        this.power = 60;
        this.acc = 95;
        this.PP = 25;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.affectsCrit = true;
        this.Critnum = 1;
    }
}
