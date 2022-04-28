package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class Attract extends Moves {
    public Attract(){
        this.name = "Attract";
        this.type = "Normal";
        this.PP = 15;
        this.canInfatuate = true;
        this.savedPP = this.PP;
        this.TMNum = 31;
        this.ignoreSubstitute = true;
    }
}
