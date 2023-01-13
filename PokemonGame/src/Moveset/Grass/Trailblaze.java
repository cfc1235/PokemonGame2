package Moveset.Grass;

import BattleMechanics.Moves;

public class Trailblaze extends Moves {
    public Trailblaze(){
        this.name = "Trailblaze";
        this.type = "Grass";
        this.power = 50;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.statChangeReqChance = true;
        this.StatChangeReq = 100;
        this.StateChangeAlly = true;
        this.affectsSpeed = true;
        this.MultChange = 1;
        this.changeTypeName = " speed ";
        this.makesContact = true;
    }
}
