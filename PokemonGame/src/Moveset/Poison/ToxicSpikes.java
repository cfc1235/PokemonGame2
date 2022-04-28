package Moveset.Poison;

import BattleMechanics.Moves;

public class ToxicSpikes extends Moves {
    public ToxicSpikes(){
        this.name = "Toxic Spikes";
        this.type = "Poison";
        this.toxicSpikesGround = true;
        this.PP = 20;
        this.savedPP = this.PP;
        this.TMNum = 154;
    }
}
