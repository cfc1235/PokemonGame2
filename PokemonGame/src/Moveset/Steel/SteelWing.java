package Moveset.Steel;

import BattleMechanics.Moves;

public class SteelWing extends Moves {
    public SteelWing(){
        this.name = "Steel Wing";
        this.type = "Steel";
        this.power = 70;
        this.acc = 90;
        this.PP = 25;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
        this.StateChangeAlly = true;
        this.affectsPhysDef = true;
        this.MultChange = 1;
        this.statChangeReqChance= true;
        this.StatChangeReq = 10;
        this.changeTypeName = "defense ";
        this.TMNum = 30;
    }
}
