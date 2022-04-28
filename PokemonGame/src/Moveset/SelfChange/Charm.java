package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Charm extends Moves {
    public Charm(){
        this.name = "Charm";
        this.type = "Fairy";
        this.PP = 20;
        this.StatchangeEnemy = true;
        this.affectsPhysAtt = true;
        this.MultChange = -1;
        this.changeTypeName = " attack ";
        this.savedPP = this.PP;
        this.TMNum = 29;
    }
}
