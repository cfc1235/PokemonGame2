package Moveset.Flying;

import BattleMechanics.Moves;

public class WingAttack extends Moves {

    public WingAttack(){
        this.name = "Wing Attack";
        this.type = "Flying";
        this.PP = 35;
        this.savedPP = this.PP;
        this.power = 60;
        this.acc = 100;
        this.CanMiss = true;
        this.makesContact = true;
        this.dealsDamage = true;
    }
}
