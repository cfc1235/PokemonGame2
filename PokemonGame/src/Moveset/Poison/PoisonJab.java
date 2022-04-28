package Moveset.Poison;

import BattleMechanics.Moves;

public class PoisonJab extends Moves {
    public PoisonJab(){
        this.PP = 20;
        this.savedPP = this.PP;
        this.type = "Poison";
        this.power = 80;
        this.acc = 100;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.name = "Poison Jab";
        this.canPoison = true;
        this.poisonChance = 30;
        this.makesContact = true;
        this.TMNum = 157;
    }
}
