package Moveset.SwapPower;

import BattleMechanics.Moves;

public class Trick extends Moves {
    public Trick(){
        this.name = "Trick";
        this.TMNum = 138;
        this.PP = 10;
        this.savedPP = this.PP;
        this.type = "Psychic";
    }
}
