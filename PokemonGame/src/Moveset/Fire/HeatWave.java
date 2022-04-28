package Moveset.Fire;

import BattleMechanics.Moves;

public class HeatWave extends Moves {
    public HeatWave(){
        this.name = "Heat Wave";
        this.type = "Fire";
        this.power = 95;
        this.acc = 90;
        this.PP = 10;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.canBurn = true;
        this.burnChance = 10;
        this.TMNum = 136;
    }
}
