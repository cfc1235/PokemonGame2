package Moveset.Fire;

import BattleMechanics.Moves;

public class BlazeKick extends Moves {
    public BlazeKick(){
        this.name = "Blaze Kick";
        this.type = "Fire";
        this.power = 85;
        this.acc = 90;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 141;
        this.canBurn = true;
        this.burnChance = 10;
        this.makesContact = true;
        this.Critnum = 1;
        this.affectsCrit = true;
    }
}
