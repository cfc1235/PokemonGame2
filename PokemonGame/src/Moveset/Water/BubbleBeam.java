package Moveset.Water;

import BattleMechanics.Moves;

public class BubbleBeam extends Moves {
    public BubbleBeam(){
        this.name = "Bubble Beam";
        this.PP = 20;
        this.savedPP = this.PP;
        this.power = 65;
        this.acc = 100;
        this.CanMiss = true;
        this.dealsDamage = true;
        this.isSpecial = true;
        this.type = "Water";
        this.goesFirst = true;
        this.StatchangeEnemy = true;
        this.affectsSpeed = true;
        this.MultChange = -1;
        this.statChangeReqChance= true;
        this.StatChangeReq = 100;
        this.changeTypeName = " speed ";
    }
}
