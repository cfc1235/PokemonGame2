package Moveset;

import BattleMechanics.Moves;

public class AncientPower extends Moves {
    public AncientPower(){
        this.name = "Ancient Power";
        this.type = "Rock";
        this.power = 60;
        this.acc = 100;
        this.PP = 5;
        this.isSpecial = true;
        this.StateChangeAlly = true;
        this.StatChangeReq = 10;
        this.statChangeReqChance = true;
        this.affectsSpecAtt = true;
        this.affectsAcc = true;
        this.affectsPhysAtt = true;
        this.affectsSpecDef = true;
        this.affectsPhysDef = true;
        this.affectsSpeed = true;
        this.affectsEv = true;
        this.MultChange = 1;
        this.changeTypeName = " all stats ";
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
    }
}
