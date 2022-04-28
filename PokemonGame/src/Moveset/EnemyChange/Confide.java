package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class Confide extends Moves {
    public Confide(){
        this.name = "Confide";
        this.type = "Normal";
        this.PP = 20;
        this.savedPP = this.PP;
        this.CanMiss = true;
        this.acc = 100;
        this.affectsSpecAtt = true;
        this.MultChange = -1;
        this.changeTypeName = " special attack ";
        this.StatchangeEnemy = true;
        this.TMNum = 100;
    }
}
