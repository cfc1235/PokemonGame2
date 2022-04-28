package Moveset.Bug;

import BattleMechanics.Moves;

public class BugBuzz extends Moves {
    public BugBuzz(){
        this.name = "Bug Buzz";
        this.type = "Bug";
        this.power = 90;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 161;
        this.statChangeReqChance = true;
        this.StatChangeReq = 10;
        this.StatchangeEnemy = true;
        this.affectsSpecDef = true;
        this.MultChange = -1;
        this.changeTypeName = " special defense ";
        this.isSpecial = true;
    }
}
