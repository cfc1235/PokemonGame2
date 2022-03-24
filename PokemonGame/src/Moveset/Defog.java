package Moveset;

import BattleMechanics.Moves;

public class Defog extends Moves {

    public Defog(){
        this.name = "Defog";
        this.PP = 15;
        this.savedPP = this.PP;
        this.type = "Flying";
        this.breaksBarriers = true;
        this.TMNum = 397;
        this.StatchangeEnemy = true;
        this.MultChange = -1;
        this.affectsEv = true;
        this.changeTypeName = " evasiveness ";
    }
}
