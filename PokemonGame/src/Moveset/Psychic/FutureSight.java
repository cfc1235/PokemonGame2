package Moveset.Psychic;

import BattleMechanics.Moves;

public class FutureSight extends Moves {

    public FutureSight(){
        this.name = "Future Sight";
        this.type = "Psychic";
        this.dealsFutureDamage = true;
        this.dealsDamage = true;
        this.timeToFutureDamage = 3;
        this.CanMiss = true;
        this.acc = 100;
        this.power = 120;
        this.isSpecial = true;
        this.PP = 10;
        this.savedPP = this.PP;
        this.TMNum = 134;
    }
}
