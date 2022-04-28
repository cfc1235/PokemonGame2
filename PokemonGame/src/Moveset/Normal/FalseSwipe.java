package Moveset.Normal;

import BattleMechanics.Moves;

public class FalseSwipe extends Moves {
    public FalseSwipe() {
        this.name = "False Swipe";
        this.type = "Normal";
        this.power = 40;
        this.acc = 100;
        this.PP = 40;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 94;
        this.makesContact = true;
    }
}
