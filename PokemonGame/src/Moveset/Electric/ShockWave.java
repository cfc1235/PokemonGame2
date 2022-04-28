package Moveset.Electric;

import BattleMechanics.Moves;

public class ShockWave extends Moves {

    public ShockWave(){
        this.name = "Shock Wave";
        this.type = "Electric";
        this.dealsDamage = true;
        this.CanMiss = false;
        this.power = 60;
        this.PP = 20;
        this.savedPP = this.PP;
        this.isSpecial = true;
        this.TMNum = 234;
    }
}
