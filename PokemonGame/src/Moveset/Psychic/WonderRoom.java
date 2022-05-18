package Moveset.Psychic;

import BattleMechanics.Moves;

public class WonderRoom extends Moves {
    public WonderRoom(){
        this.name = "Wonder Room";
        this.type = "Psychic";
        this.PP = 5;
        this.createsWonderRoom = 5;
        this.savedPP = this.PP;
        this.ignoreSubstitute = true;
        this.TMNum = 71;
    }
}
