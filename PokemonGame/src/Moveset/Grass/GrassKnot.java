package Moveset.Grass;

import BattleMechanics.Moves;

public class GrassKnot extends Moves {
    public GrassKnot(){
        this.name = "Grass Knot";
        this.type = "Grass";
        this.acc = 100;
        this.PP = 20;
        this.isSpecial = true;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
        this.TMNum = 177;
    }
}
