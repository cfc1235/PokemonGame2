package Moveset.Poison;

import BattleMechanics.Moves;

public class PoisonTail extends Moves {
    public PoisonTail(){
        this.PP = 25;
        this.savedPP = this.PP;
        this.type = "Poison";
        this.power = 50;
        this.acc = 100;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.name = "Poison Tail";
        this.canPoison = true;
        this.poisonChance = 10;
        this.makesContact = true;
        this.Critnum = 1;
    }
}
