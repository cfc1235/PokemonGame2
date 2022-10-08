package Moveset.Normal;

import BattleMechanics.Moves;

public class Feint extends Moves {
    public Feint(){
        this.name = "Feint";
        this.type = "Normal";
        this.power = 30;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact =true;
        this.breaksBarriers = true;
    }
}
