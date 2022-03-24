package Moveset;

import BattleMechanics.Moves;

public class ChargeBeam extends Moves {

    public ChargeBeam() {
        this.name = "Charge Beam";
        this.type = "Electric";
        this.power = 50;
        this.acc = 90;
        this.PP = 10;
        this.isSpecial = true;
        this.StateChangeAlly = true;
        this.StatChangeReq = 70;
        this.statChangeReqChance = true;
        this.affectsSpecAtt = true;
        this.MultChange = 1;
        this.changeTypeName = " special attack ";
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 57;
    }
}
