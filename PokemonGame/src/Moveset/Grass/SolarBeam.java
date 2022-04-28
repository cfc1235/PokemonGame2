package Moveset.Grass;

import BattleMechanics.Moves;

public class SolarBeam extends Moves {
    public SolarBeam(){
        this.name = "Solar Beam";
        this.type = "Grass";
        this.power = 120;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.savedPP = this.PP;
        this.reqCharge = true;
        this.turnLength = 2;
        this.TMNum = 222;
    }
}
