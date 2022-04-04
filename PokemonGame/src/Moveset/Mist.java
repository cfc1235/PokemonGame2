package Moveset;

import BattleMechanics.Moves;

public class Mist extends Moves {
    public Mist(){
        this.name = "Mist";
        this.PP = 30;
        this.type = "Ice";
        this.savedPP = this.PP;
        this.protectsFromStatChanges = 5;
    }
}
