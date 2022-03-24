package Moveset;

import BattleMechanics.Moves;

public class Hypnosis extends Moves {

    public Hypnosis(){
        this.onlyCanSleep = true;
        this.CanMiss = true;
        this.acc = 60;
        this.PP = 20;
        this.savedPP = this.PP;
        this.name = "Hypnosis";
        this.type = "Psychic";
    }
}
