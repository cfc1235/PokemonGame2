package Moveset.Normal;

import BattleMechanics.Moves;

public class Cut extends Moves {

    public Cut(){
        this.name = "Cut";
        this.type = "Normal";
        this.makesContact = true;
        this.power = 50;
        this.CanMiss = true;
        this.acc = 95;
        this.PP = 30;
        this.savedPP = this.PP;
        this.TMNum = 293;
        this.dealsDamage = true;
    }
}
