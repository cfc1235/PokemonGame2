package Moveset.Grass;

import BattleMechanics.Moves;

public class SolarBlade extends Moves {
    public SolarBlade(){
        this.name = "Solar Blade";
        this.type = "Grass";
        this.power = 125;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
        this.savedPP = this.PP;
        this.reqCharge = true;
        this.turnLength = 2;
        this.TMNum = 12;
    }
}
