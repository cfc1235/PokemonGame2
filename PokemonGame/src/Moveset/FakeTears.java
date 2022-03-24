package Moveset;

import BattleMechanics.Moves;

public class FakeTears extends Moves {
    public FakeTears(){
        this.PP = 20;
        this.savedPP = this.PP;
        this.name = "Fake Tears";
        this.type = "Dark";
        this.StatchangeEnemy = true;
        this.affectsSpecDef = true;
        this.MultChange = -2;
        this.changeTypeName = " special defense harshly ";
    }
}
