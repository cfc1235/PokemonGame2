package Moveset;

import BattleMechanics.Moves;

public class LightScreen extends Moves {
    public LightScreen(){
        this.name = "Light Screen";
        this.type = "Psychic";
        this.createsSpecWall = true;
        this.specWallTimer = 5;
        this.PP = 20;
        this.savedPP = this.PP;
        this.TMNum = 17;
    }
}
