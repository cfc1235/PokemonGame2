package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class BabyDollEyes extends Moves {
    public BabyDollEyes(){
        this.name = "Baby-Doll Eyes";
        this.type = "Fairy";
        this.PP = 30;
        this.StatchangeEnemy = true;
        this.affectsPhysAtt = true;
        this.MultChange = -1;
        this.changeTypeName = " attack ";
        this.savedPP = this.PP;
        this.goesFirst = true;
    }
}
