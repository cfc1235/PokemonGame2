package Moveset.Fire;

import BattleMechanics.Moves;

public class BurnUp extends Moves {
    public BurnUp(){
        this.name = "Burn Up";
        this.type = "Fire";
        this.power = 130;
        this.acc = 100;
        this.PP = 5;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.resetsType = true;
        this.resetsTypeFrom = "Fire";
        this.StateChangeAlly = true;
    }
}
