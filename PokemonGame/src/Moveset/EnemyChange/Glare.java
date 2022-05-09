package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class Glare extends Moves {
    public Glare(){
        this.name = "Glare";
        this.type = "Normal";
        this.PP = 30;
        this.acc = 100;
        this.onlyCanParalyze = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
    }
}
