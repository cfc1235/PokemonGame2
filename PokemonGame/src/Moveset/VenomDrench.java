package Moveset;

import BattleMechanics.Moves;

public class VenomDrench extends Moves {

    public VenomDrench(){
        this.name = "Venom Drench";
        this.type = "Poison";
        this.PP = 20;
        this.StatchangeEnemy = true;
        this.affectsPhysAtt = true;
        this.affectsSpecAtt =true;
        this.affectsSpeed = true;
        this.acc = 100;
        this.CanMiss = true;
        this.MultChange = -1;
        this.changeTypeName = " attack, special attack, and speed ";
        this.savedPP = this.PP;
    }
}
