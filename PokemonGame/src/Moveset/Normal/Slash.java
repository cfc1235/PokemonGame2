package Moveset.Normal;

import BattleMechanics.Moves;

public class Slash extends Moves {
    public Slash(){
        this.name = "Slash";
        this.type = "Normal";
        this.power = 70;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.affectsCrit = true;
        this.Critnum = 1;
        this.savedPP = this.PP;
    }
}
