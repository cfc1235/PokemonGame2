package Moveset.Bug;

import BattleMechanics.Moves;

public class FirstImpression extends Moves {
    public FirstImpression(){
        this.name = "First Impression";
        this.type = "Bug";
        this.makesContact = true;
        this.dealsDamage = true;
        this.power = 90;
        this.CanMiss = true;
        this.acc = 100;
        this.PP = 10;
        this.savedPP = this.PP;
    }
}
