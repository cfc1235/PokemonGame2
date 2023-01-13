package Moveset.Bug;

import BattleMechanics.Moves;

public class Pounce extends Moves {
    public Pounce(){
        this.name = "Pounce";
        this.type = "Bug";
        this.power = 50;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.statChangeReqChance = true;
        this.StatChangeReq = 100;
        this.StatchangeEnemy = true;
        this.affectsSpeed = true;
        this.MultChange = -1;
        this.changeTypeName = " speed ";
        this.makesContact = true;
    }
}
