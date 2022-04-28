package Moveset.Bug;

import BattleMechanics.Moves;

public class FellStinger extends Moves {
    public FellStinger(){
        this.name = "Fell Stinger";
        this.type = "Bug";
        this.makesContact = true;
        this.dealsDamage = true;
        this.power = 50;
        this.CanMiss = true;
        this.acc = 100;
        this.PP = 25;
        this.savedPP = this.PP;
        this.needsKnockOut = true;
        this.StateChangeAlly = true;
        this.affectsPhysAtt = true;
        this.MultChange = 2;
        this.changeTypeName = " attack sharply ";
    }
}
