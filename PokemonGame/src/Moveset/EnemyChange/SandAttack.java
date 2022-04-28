package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class SandAttack extends Moves {

    public SandAttack(){
        this.name = "Sand Attack";
        this.type = "Ground";
        this.PP = 15;
        this.savedPP = this.PP;
        this.CanMiss = true;
        this.acc = 100;
        this.affectsAcc = true;
        this.MultChange = -1;
        this.changeTypeName = " accuracy ";
        this.StatchangeEnemy = true;
    }
}
