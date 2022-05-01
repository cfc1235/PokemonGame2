package Moveset.Normal;

import BattleMechanics.Moves;

public class Return extends Moves {

    public Return(){
        this.name = "Return";
        this.PP = 20;
        this.savedPP = this.PP;
        this.CanMiss = true;
        this.acc = 100;
        this.makesContact = true;
        this.type = "Normal";
        this.TMNum = 327;
    }
}
