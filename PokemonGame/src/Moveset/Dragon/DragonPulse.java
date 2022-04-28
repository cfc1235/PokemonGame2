package Moveset.Dragon;

import BattleMechanics.Moves;

public class DragonPulse extends Moves {
    public DragonPulse(){
        this.name = "Dragon Pulse";
        this.type = "Dragon";
        this.power = 85;
        this.acc = 100;
        this.PP = 10;
        this.isSpecial = true;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 162;
    }
}
