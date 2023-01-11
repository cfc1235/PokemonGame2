package Moveset.Rock;

import BattleMechanics.Moves;

public class PowerGem extends Moves {
    public PowerGem(){
        this.name = "Power Gem";
        this.type = "Rock";
        this.power = 80;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.savedPP = this.PP;
    }
}
