package Moveset;

import BattleMechanics.Moves;

public class QuickAttack extends Moves {
    public QuickAttack(){
        this.name = "Quick Attack";
        this.PP = 30;
        this.savedPP = this.PP;
        this.power = 40;
        this.acc = 100;
        this.CanMiss = true;
        this.dealsDamage = true;
        this.makesContact = true;
        this.type = "Normal";
        this.goesFirst = true;
    }
}
