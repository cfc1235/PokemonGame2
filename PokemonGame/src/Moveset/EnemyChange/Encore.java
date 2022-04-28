package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class Encore extends Moves {

    public Encore(){
        this.name = "Encore";
        this.PP = 5;
        this.savedPP = this.PP;
        this.CanMiss = true;
        this.type = "Normal";
        this.causesEnemyOutrage = true;
        this.enemyOutrageTimer = 3;
        this.TMNum = 130;
    }
}
