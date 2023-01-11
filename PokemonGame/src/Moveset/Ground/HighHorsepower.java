package Moveset.Ground;

import BattleMechanics.Moves;

public class HighHorsepower extends Moves {
    public HighHorsepower(){
        this.name = "High Horsepower";
        this.type = "Ground";
        this.power = 95;
        this.acc = 95;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
    }
}
