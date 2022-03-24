package Moveset;

import BattleMechanics.Moves;

public class Embargo extends Moves {
    public Embargo(){
        this.name = "Embargo";
        this.type = "Dark";
        this.CanMiss = false;
        this.PP = 15;
        this.savedPP = this.PP;
        this.causesNoItem = true;
        this.noItemTimer = 5;
        this.TMNum = 63;
    }
}
