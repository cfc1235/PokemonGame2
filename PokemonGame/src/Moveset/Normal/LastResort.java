package Moveset.Normal;

import BattleMechanics.Moves;

public class LastResort extends Moves {
    public LastResort(){
        this.name = "Last Resort";
        this.type = "Normal";
        this.dealsDamage = true;
        this.power = 140;
        this.PP = 5;
        this.savedPP = this.PP;
        this.makesContact = true;
        this.acc = 100;
        this.CanMiss = true;
    }
}
