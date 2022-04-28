package Moveset.Poison;

import BattleMechanics.Moves;

public class Coil extends Moves {

    public Coil(){
        this.StateChangeAlly = true;
        this.affectsPhysAtt = true;
        this.affectsPhysDef = true;
        this.affectsAcc = true;
        this.MultChange = 1;
        this.type = "Poison";
        this.PP = 20;
        this.savedPP = this.PP;
        this.name = "Coil";
        this.changeTypeName = " defense, attack, and accuracy ";
    }
}
