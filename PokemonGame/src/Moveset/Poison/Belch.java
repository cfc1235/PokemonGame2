package Moveset.Poison;

import BattleMechanics.Moves;

public class Belch extends Moves {
    public Belch(){
        this.name = "Belch";
        this.PP = 10;
        this.isSpecial = true;
        this.savedPP = this.PP;
        this.power = 120;
        this.type = "Poison";
        this.CanMiss = true;
        this.acc = 90;
        this.dealsDamage = true;
    }
}
