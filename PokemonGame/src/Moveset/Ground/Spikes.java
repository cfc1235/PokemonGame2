package Moveset.Ground;

import BattleMechanics.Moves;

public class Spikes extends Moves {
    public Spikes(){
        this.name = "Spikes";
        this.type = "Ground";
        this.spikesGround = true;
        this.PP = 20;
        this.savedPP = this.PP;
        this.TMNum = 123;
    }
}
