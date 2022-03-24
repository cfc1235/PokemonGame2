package Moveset;

import BattleMechanics.Moves;


public class Strength extends Moves {
    public Strength(){
        this.name = "Strength";
        this.type = "Normal";
        this.power = 80;
        this.CanMiss = true;
        this.acc = 100;
        this.PP = 15;
        this.savedPP = this.PP;
        this.makesContact = true;
        this.dealsDamage = true;
    }
}
