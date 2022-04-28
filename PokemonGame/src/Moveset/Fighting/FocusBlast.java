package Moveset.Fighting;

import BattleMechanics.Moves;

public class FocusBlast extends Moves {
    public FocusBlast(){
        this.name = "Focus Blast";
        this.type = "Fighting";
        this.power = 120;
        this.acc = 70;
        this.PP = 5;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.StatchangeEnemy = true;
        this.StatChangeReq = 10;
        this.statChangeReqChance = true;
        this.affectsSpecDef = true;
        this.MultChange = -1;
        this.changeTypeName = " special defense";
        this.isSpecial = true;
        this.savedPP = this.PP;
        this.TMNum = 164;
    }
}
