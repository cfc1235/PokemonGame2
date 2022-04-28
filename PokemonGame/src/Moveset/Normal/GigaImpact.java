package Moveset.Normal;

import BattleMechanics.Moves;

public class GigaImpact extends Moves {
    public GigaImpact(){
        this.name = "Hyper Beam";
        this.type = "Normal";
        this.power = 150;
        this.acc = 90;
        this.PP = 5;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 9;
        this.makesContact = true;
        this.forcesSitOut = true;
    }
}
