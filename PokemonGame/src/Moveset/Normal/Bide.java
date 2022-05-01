package Moveset.Normal;

import BattleMechanics.Moves;

public class Bide extends Moves {
    public Bide(){
        this.name = "Bide";
        this.dealsFutureDamage = true;
        this.timeToFutureDamage = 3;
        this.PP = 10;
        this.savedPP = this.PP;
        this.makesContact = true;
    }
}
