package Moveset;

import BattleMechanics.Moves;

public class Yawn extends Moves {
    public Yawn(){
        this.name = "Yawn";
        this.futureFallAsleep = true;
        this.futureFallAsleepTimer = 2;
        this.type = "Normal";
        this.PP = 10;
        this.savedPP = this.PP;
    }
}
