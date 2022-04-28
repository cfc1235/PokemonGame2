package Moveset.Fighting;

import BattleMechanics.Moves;

public class FocusPunch extends Moves {

    public FocusPunch(){
        this.name = "Focus Punch";
        this.type = "Fighting";
        this.power = 150;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
        this.savedPP = this.PP;
        this.reqCharge = true;
        this.turnLength = 2;
        this.TMNum = 201;
    }
}
