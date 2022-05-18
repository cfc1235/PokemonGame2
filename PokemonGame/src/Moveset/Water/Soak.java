package Moveset.Water;

import BattleMechanics.Moves;

public class Soak extends Moves {
    public Soak(){
        this.resetsType = true;
        this.resetsTypeFrom = "Both";
        this.resetsTypeTo = "Water";
        this.name = "Soak";
        this.PP = 20;
        this.type = "Water";
        this.savedPP = this.PP;
        this.ignoreSubstitute = true;
        this.StatchangeEnemy = true;
    }
}
