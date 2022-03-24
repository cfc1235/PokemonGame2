package Moveset;

import BattleMechanics.Moves;

public class NightShade extends Moves {

    public NightShade(){
        this.name = "Night Shade";
        this.type = "Ghost";
        this.acc = 100;
        this.CanMiss = true;
        this.isSpecial = true;
        this.PP = 15;
        this.savedPP = this.PP;
        this.dealsDamage = true;
    }
}
