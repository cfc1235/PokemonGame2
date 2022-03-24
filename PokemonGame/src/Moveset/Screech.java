package Moveset;

import BattleMechanics.Moves;

public class Screech extends Moves {

    public Screech(){
        this.name = "Screech";
        this.StatchangeEnemy = true;
        this.type = "Normal";
        this.affectsPhysDef = true;
        this.CanMiss = true;
        this.acc = 85;
        this.MultChange = -2;
        this.changeTypeName = " physical defense harshly ";
        this.PP = 40;
        this.savedPP = this.PP;
        this.TMNum = 216;
    }
}
