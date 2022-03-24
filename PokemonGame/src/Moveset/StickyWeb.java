package Moveset;

import BattleMechanics.Moves;

public class StickyWeb extends Moves {
    public StickyWeb(){
        this.name = "Sticky Web";
        this.type = "Bug";
        this.websGround = true;
        this.PP = 20;
        this.savedPP = this.PP;
    }
}
