package Moveset;

import BattleMechanics.Moves;

public class FeatherDance extends Moves {

    public FeatherDance(){
        this.name = "Feather Dance";
        this.CanMiss = true;
        this.acc = 100;
        this.type = "Flying";
        this.PP = 15;
        this.savedPP = this.PP;
        this.StatchangeEnemy = true;
        this.MultChange = -1;
        this.affectsPhysAtt = true;
        this.changeTypeName = " attack ";
    }
}
