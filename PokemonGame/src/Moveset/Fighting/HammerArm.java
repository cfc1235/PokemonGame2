package Moveset.Fighting;

import BattleMechanics.Moves;

public class HammerArm extends Moves {
    public HammerArm(){
        this.name = "Hammer Arm";
        this.type = "Fighting";
        this.power = 100;
        this.acc = 90;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.statChangeReqChance = true;
        this.StatChangeReq = 100;
        this.StateChangeAlly = true;
        this.affectsSpeed = true;
        this.MultChange = -1;
        this.changeTypeName = " speed ";
    }
}
