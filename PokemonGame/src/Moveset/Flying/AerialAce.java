package Moveset.Flying;

import BattleMechanics.Moves;

public class AerialAce extends Moves {
    public AerialAce(){
        this.name = "Aerial Ace";
        this.power = 60;
        this.PP = 20;
        this.savedPP = this.PP;
        this.type = "Flying";
        this.makesContact = true;
        this.dealsDamage = true;
        this.TMNum = 240;
    }
}
