package Moveset;

import BattleMechanics.Moves;

public class MirrorMove extends Moves {

    public MirrorMove(){
        this.name = "Mirror Move";
        this.PP = 20;
        this.savedPP = this.PP;
        this.type = "Flying";
    }
}
