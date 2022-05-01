package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class MeanLook extends Moves {
    public MeanLook(){
        this.name = "Mean Look";
        this.causesCannotFlee = true;
        this.PP = 5;
        this.savedPP = this.PP;
        this.type = "Normal";
    }
}
