package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class ScaryFace extends Moves {
    public ScaryFace(){
        this.name = "Scary Face";
        this.type = "Normal";
        this.PP = 10;
        this.StatchangeEnemy = true;
        this.affectsSpeed = true;
        this.MultChange = -2;
        this.changeTypeName = "speed harshly ";
        this.savedPP = this.PP;
        this.TMNum = 26;
    }
}
