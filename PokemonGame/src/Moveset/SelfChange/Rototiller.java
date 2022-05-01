package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Rototiller extends Moves {
    public Rototiller(){
        this.name = "Rototiller";
        this.type = "Rock";
        this.PP = 10;
        this.StateChangeAlly = true;
        this.StatchangeEnemy = true;
        this.affectsSpecAtt = true;
        this.affectsPhysAtt =true;
        this.MultChange = 1;
        this.changeTypeName = " physical and special attack ";
        this.savedPP = this.PP;
    }
}
