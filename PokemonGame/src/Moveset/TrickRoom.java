package Moveset;

import BattleMechanics.Moves;

public class TrickRoom extends Moves {
    public TrickRoom(){
        this.name = "Trick Room";
        this.type = "Psychic";
        this.PP = 5;
        this.createsTrickRoom = 5;
        this.savedPP = this.PP;
        this.ignoreSubstitute = true;
    }
}
