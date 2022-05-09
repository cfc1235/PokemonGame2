package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class Sing extends Moves {
    public Sing(){
        this.onlyCanSleep = true;
        this.CanMiss = true;
        this.acc = 55;
        this.PP = 15;
        this.savedPP = this.PP;
        this.name = "Sing";
        this.type = "Normal";
    }
}
