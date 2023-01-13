package Moveset.Normal;

import BattleMechanics.Moves;

public class Boomburst extends Moves {
    public Boomburst(){
        this.name = "Boomburst";
        this.type = "Normal";
        this.power = 140;
        this.PP = 10;
        this.dealsDamage = true;
        this.savedPP = this.PP;
        this.acc = 100;
        this.isSpecial = true;
        this.CanMiss = true;
    }
}
