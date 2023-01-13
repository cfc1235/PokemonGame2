package Moveset.Steel;

import BattleMechanics.Moves;

public class SmartStrike extends Moves {
    public SmartStrike(){
        this.name = "Smart Strike";
        this.type = "Steel";
        this.power = 70;
        this.PP = 10;
        this.dealsDamage = true;
        this.savedPP = this.PP;
        this.makesContact = true;
    }
}
