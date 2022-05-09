package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class Disable extends Moves {
    public Disable(){
        this.CanMiss = true;
        this.acc = 100;
        this.causesDisabled = 4;
        this.PP = 20;
        this.savedPP = this.PP;
        this.name = "Disable";
        this.type = "Normal";
    }
}
