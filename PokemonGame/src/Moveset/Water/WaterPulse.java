package Moveset.Water;

import BattleMechanics.Moves;

public class WaterPulse extends Moves {
    public WaterPulse(){
        this.name = "Water Pulse";
        this.type = "Water";
        this.power = 60;
        this.acc = 100;
        this.PP = 20;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.canConfuse = true;
        this.confuseChance = 20;
        this.TMNum = 203;
    }
}
