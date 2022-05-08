package Moveset.Water;

import BattleMechanics.Moves;

public class AquaRing extends Moves {
    public AquaRing(){
        this.name = "Aqua Ring";
        this.type = "Water";
        this.PP = 20;
        this.savedPP = this.PP;
        this.addsToHP = 1.0/16;
    }
}
