package Moveset;

import BattleMechanics.Moves;

public class SpitUp extends Moves {

    public SpitUp(){
        this.name = "Spit Up";
        this.PP = 10;
        this.isSpecial = true;
        this.type = "Normal";
        this.savedPP = this.PP;
    }
}
