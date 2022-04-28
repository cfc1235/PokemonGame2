package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class Smokescreen extends Moves {
    public Smokescreen(){
        this.name = "Smokescreen";
        this.type = "Normal";
        this.PP = 20;
        this.StatchangeEnemy = true;
        this.affectsAcc = true;
        this.MultChange = -1;
        this.changeTypeName = "accuracy ";
        this.savedPP = this.PP;
    }
}
