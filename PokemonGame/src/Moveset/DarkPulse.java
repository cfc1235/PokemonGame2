package Moveset;

import BattleMechanics.Moves;

public class DarkPulse extends Moves {
    public DarkPulse(){
        this.name = "Dark Pulse";
        this.type = "Dark";
        this.power = 80;
        this.acc = 100;
        this.PP = 15;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.canFlinch = true;
        this.FlinchChance = 20;
        this.TMNum = 97;
        this.dealsDamage = true;
    }
}
