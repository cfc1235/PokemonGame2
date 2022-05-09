package Moveset.Psychic;

import BattleMechanics.Moves;

public class MagicRoom extends Moves {
    public MagicRoom(){
        this.name = "Magic Room";
        this.PP = 10;
        this.savedPP = this.PP;
        this.type = "Psychic";
        this.magicRoomAdd = 5;
        this.TMNum = 72;
    }
}
