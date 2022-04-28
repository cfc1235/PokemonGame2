package Moveset.Dark;

import BattleMechanics.Moves;

public class Pursuit extends Moves {

    public Pursuit(){
        this.name = "Pursuit";
        this.type = "Dark";
        this.power = 40;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = PP;
        this.makesContact = true;
    }
}
