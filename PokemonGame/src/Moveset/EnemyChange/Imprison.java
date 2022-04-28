package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class Imprison extends Moves {

    public Imprison(){
        this.name = "Imprison";
        this.type = "Psychic";
        this.PP = 10;
        this.savedPP = this.PP;
        this.createsImprison = true;
        this.TMNum = 44;
    }
}
