package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class SweetScent extends Moves {
    public SweetScent(){
        this.name = "Sweet Scent";
        this.type = "Normal";
        this.PP = 20;
        this.StatchangeEnemy = true;
        this.MultChange = -2;
        this.changeTypeName = "evasiveness harshly ";
        this.savedPP = this.PP;
    }
}
