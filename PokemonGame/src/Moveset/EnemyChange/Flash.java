package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class Flash extends Moves {

    public Flash(){
        this.name = "Flash";
        this.type = "Normal";
        this.PP = 20;
        this.StatchangeEnemy = true;
        this.affectsAcc = true;
        this.MultChange = -1;
        this.changeTypeName = " accuracy ";
        this.savedPP = this.PP;
        this.ignoreSubstitute = true;
        this.TMNum = 270;
    }
}
