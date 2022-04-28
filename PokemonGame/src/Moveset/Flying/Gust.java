package Moveset.Flying;

import BattleMechanics.Moves;

public class Gust extends Moves {
    public Gust(){
        this.name = "Gust";
        this.type = "Flying";
        this.power = 40;
        this.acc = 100;
        this.PP = 35;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.isSpecial =true;
    }
}
