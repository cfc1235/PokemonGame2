package Moveset;

import BattleMechanics.Moves;

public class Superpower extends Moves {

    public Superpower(){
        this.name = "Superpower";
        this.type = "Fighting";
        this.power = 120;
        this.acc = 100;
        this.PP = 5;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 139;
        this.statChangeReqChance = true;
        this.StatChangeReq = 100;
        this.StateChangeAlly = true;
        this.affectsPhysDef = true;
        this.affectsPhysAtt = true;
        this.MultChange = -1;
        this.changeTypeName = " attack and defense ";
        this.makesContact = true;
    }
}
