package Moveset.Poison;

import BattleMechanics.Moves;

public class PoisonSting extends Moves {

    public PoisonSting(){
        this.name = "Poison Sting";
        this.PP = 35;
        this.savedPP = this.PP;
        this.power = 15;
        this.type = "Poison";
        this.CanMiss = true;
        this.acc = 100;
        this.canPoison = true;
        this.poisonChance = 30;
        this.dealsDamage = true;
    }
}
