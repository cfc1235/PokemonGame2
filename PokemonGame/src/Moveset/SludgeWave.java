package Moveset;

import BattleMechanics.Moves;

public class SludgeWave extends Moves {

    public SludgeWave(){
        this.dealsDamage = true;
        this.CanMiss = true;
        this.name = "Sludge Wave";
        this.type = "Poison";
        this.isSpecial = true;
        this.canPoison = true;
        this.PP = 10;
        this.savedPP = this.PP;
        this.poisonChance = 10;
        this.power = 95;
        this.acc = 100;
        this.TMNum = 34;
    }
}
