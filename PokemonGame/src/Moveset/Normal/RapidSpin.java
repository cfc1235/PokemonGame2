package Moveset.Normal;

import BattleMechanics.Moves;

public class RapidSpin extends Moves {
    public RapidSpin(){
        this.endsVortex = true;
        this.name = "Rapid Spin";
        this.type = "Normal";
        this.power = 50;
        this.acc = 100;
        this.PP = 40;
        this.StateChangeAlly = true;
        this.StatChangeReq = 100;
        this.statChangeReqChance = true;
        this.affectsSpeed = true;
        this.MultChange = 1;
        this.changeTypeName = " speed ";
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 39;
        this.makesContact =true;
    }
}
