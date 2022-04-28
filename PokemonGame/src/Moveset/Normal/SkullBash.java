package Moveset.Normal;

import BattleMechanics.Moves;

public class SkullBash extends Moves {
    public SkullBash(){
        this.name = "Skull Bash";
        this.type = "Normal";
        this.power = 130;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
        this.savedPP = PP;
        this.reqCharge = true;
        this.turnLength = 2;
        this.StateChangeAlly = true;
        this.StatChangeReq = 100;
        this.statChangeReqChance = true;
        this.affectsPhysDef = true;
        this.MultChange = 1;
        this.changeTypeName = " defense";
    }
}
