package Moveset.Ice;

import BattleMechanics.Moves;

public class SheerCold extends Moves {
    public SheerCold(){
        this.name = "Sheer Cold";
        this.type = "Ice";
        this.isSpecial = true;
        this.PP = 5;
        this.savedPP = this.PP;
    }
}
