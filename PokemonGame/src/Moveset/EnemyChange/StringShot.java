package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class StringShot extends Moves {
    public StringShot(){
        this.name = "String Shot";
        this.type = "Bug";
        this.PP = 40;
        this.CanMiss = true;
        this.acc = 95;
        this.StatchangeEnemy = true;
        this.affectsSpeed = true;
        this.MultChange = -2;
        this.changeTypeName = " speed harshly ";
        this.savedPP = PP;
    }
}
