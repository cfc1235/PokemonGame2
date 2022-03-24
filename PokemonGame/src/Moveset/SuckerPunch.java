package Moveset;

import BattleMechanics.Moves;

public class SuckerPunch extends Moves {
    public SuckerPunch(){
        this.name = "Sucker Punch";
        this.PP = 5;
        this.savedPP = this.PP;
        this.type = "Dark";
        this.CanMiss = true;
        this.acc = 100;
        this.power = 70;
        this.makesContact = true;
    }
}
