package Moveset.Fire;

import BattleMechanics.Moves;

public class FlameCharge extends Moves {
    public FlameCharge(){
        this.name = "Flame Charge";
        this.type = "Fire";
        this.power = 50;
        this.acc = 100;
        this.PP = 20;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
        this.StateChangeAlly = true;
        this.affectsSpeed = true;
        this.MultChange = 1;
        this.statChangeReqChance= true;
        this.StatChangeReq = 100;
        this.changeTypeName = " speed ";
        this.TMNum = 343;
    }
}
