package Moveset.Normal;

import BattleMechanics.Moves;

public class MeFirst extends Moves {

    public MeFirst(){
        this.goesFirst = true;
        this.type = "Normal";
        this.name = "Me First";
        this.doesEnemyMove = true;
        this.poweredUp = 1.5;
        this.PP = 20;
        this.savedPP = this.PP;
    }
}
