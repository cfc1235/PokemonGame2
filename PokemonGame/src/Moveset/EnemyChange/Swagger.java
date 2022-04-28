package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class Swagger extends Moves {

    public Swagger(){
        this.name = "Swagger";
        this.type = "Normal";
        this.canConfuse = true;
        this.canOnlyConfuse = true;
        this.StatchangeEnemy = true;
        this.affectsPhysAtt = true;
        this.MultChange = 2;
        this.changeTypeName = " attack sharply ";
        this.PP = 15;
        this.savedPP = this.PP;
        this.TMNum = 287;
    }
}
