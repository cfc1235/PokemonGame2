package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class TearfulLook extends Moves {
    public TearfulLook(){
        this.name = "Tearful Look";
        this.type = "Normal";
        this.PP = 20;
        this.StatchangeEnemy = true;
        this.affectsPhysAtt = true;
        this.affectsSpecAtt = true;
        this.MultChange = -1;
        this.changeTypeName = " attack and special attack ";
        this.savedPP = this.PP;
    }
}
