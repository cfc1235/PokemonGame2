package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class PlayNice extends Moves {
    public PlayNice(){
        this.name = "Play Nice";
        this.type = "Normal";
        this.PP = 30;
        this.StatchangeEnemy = true;
        this.affectsPhysAtt = true;
        this.MultChange = -1;
        this.changeTypeName = "defense";
        this.savedPP = this.PP;
    }
}
