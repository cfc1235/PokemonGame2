package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class Growl extends Moves {
    public Growl(){
        this.name = "Growl";
        this.type = "Normal";
        this.PP = 40;
        this.StatchangeEnemy = true;
        this.affectsPhysAtt = true;
        this.MultChange = -1;
        this.changeTypeName = "attack ";
        this.savedPP = this.PP;
        this.ignoreSubstitute = true;
    }
}
