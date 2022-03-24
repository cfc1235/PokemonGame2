package Moveset;

import BattleMechanics.Moves;

public class Frustration extends Moves {

    public Frustration(){
        this.name = "Frustration";
        this.PP = 20;
        this.savedPP = this.PP;
        CanMiss = true;
        this.acc = 100;
        this.makesContact = true;
        this.type = "Normal";
        this.TMNum = 21;
    }
}
