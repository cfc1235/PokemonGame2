package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Swallow extends Moves{
    public Swallow(){
        this.name = "Swallow";
        this.PP = 10;
        this.isSpecial = true;
        this.type = "Normal";
        this.savedPP = this.PP;
    }
}
