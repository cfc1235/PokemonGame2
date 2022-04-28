package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Stockpile extends Moves {
    public Stockpile(){
        this.name = "Stockpile";
        this.type = "Normal";
        this.PP = 20;
        this.savedPP = this.PP;
    }
}
