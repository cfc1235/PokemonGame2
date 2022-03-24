package Moveset;

import BattleMechanics.Moves;

public class Leer extends Moves {
    public Leer(){
        this.name = "Leer";
        this.type = "Normal";
        this.PP = 30;
        this.StatchangeEnemy = true;
        this.affectsPhysDef = true;
        this.MultChange = -1;
        this.changeTypeName = " defense ";
        this.savedPP = this.PP;
    }
}
