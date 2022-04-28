package Moveset.Electric;

import BattleMechanics.Moves;

public class ElectroBall extends Moves {
    public ElectroBall(){
        this.name = "Electro Ball";
        this.acc = 100;
        this.type = "Electric";
        this.PP = 10;
        this.savedPP = this.PP;
        this.CanMiss = true;
        this.isSpecial = true;
        this.dealsDamage = true;
        this.TMNum = 180;
    }
}
