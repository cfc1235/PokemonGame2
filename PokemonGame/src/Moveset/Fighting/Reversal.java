package Moveset.Fighting;

import BattleMechanics.Moves;

public class Reversal extends Moves {

    public Reversal(){
        this.dealsDamage = true;
        this.CanMiss = true;
        this.acc = 100;
        this.makesContact = true;
        this.PP = 15;
        this.savedPP = this.PP;
        this.name = "Reversal";
        this.type = "Fighting";
        this.TMNum = 121;
    }
}
