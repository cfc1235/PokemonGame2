package Moveset;

import BattleMechanics.Moves;

public class Reflect extends Moves {

    public Reflect(){
        this.name = "Reflect";
        this.type = "Psychic";
        this.createsPhysWall = true;
        this.physWallTimer = 5;
        this.PP = 20;
        this.savedPP = this.PP;
    }
}
