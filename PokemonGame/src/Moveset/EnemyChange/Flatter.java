package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class Flatter extends Moves {
    public Flatter(){
        this.name = "Flatter";
        this.type = "Dark";
        this.canOnlyConfuse = true;
        this.PP = 15;
        this.savedPP = this.PP;
        this.StatchangeEnemy = true;
        this.affectsSpecAtt = true;
        this.MultChange = 1;
        this.changeTypeName = "attack ";
    }
}
