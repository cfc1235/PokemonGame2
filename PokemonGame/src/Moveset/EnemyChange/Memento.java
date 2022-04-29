package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class Memento extends Moves {
    public Memento(){
        this.name = "Memento";
        this.type = "Dark";
        this.PP = 10;
        this.StatchangeEnemy = true;
        this.affectsPhysAtt = true;
        this.affectsSpecAtt = true;
        this.MultChange = -2;
        this.changeTypeName = " physical and special attack harshly ";
        this.savedPP = this.PP;
        this.setsHPTo0PostStatChange = true;
    }
}
