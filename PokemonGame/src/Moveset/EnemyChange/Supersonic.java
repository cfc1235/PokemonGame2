package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class Supersonic extends Moves {
    public Supersonic(){
        this.name = "Supersonic";
        this.type = "Normal";
        this.PP = 20;
        this.acc = 55;
        this.canOnlyConfuse = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.ignoreSubstitute = true;
    }
}
