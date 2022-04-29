package Moveset.Dragon;

import BattleMechanics.Moves;

public class DragonRush extends Moves {
    public DragonRush(){
        this.name = "Dragon Rush";
        this.type = "Dragon";
        this.power = 100;
        this.acc = 75;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.canFlinch = true;
        this.FlinchChance = 20;
        this.makesContact = true;
    }
}
