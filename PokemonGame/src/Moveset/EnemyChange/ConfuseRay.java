package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class ConfuseRay extends Moves {
    public ConfuseRay(){
        this.name = "Confuse Ray";
        this.type = "Ghost";
        this.canOnlyConfuse = true;
        this.CanMiss = true;
        this.acc = 100;
        this.PP = 10;
        this.savedPP = this.PP;
    }
}
