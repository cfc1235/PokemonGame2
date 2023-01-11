package Moveset.Water;

import BattleMechanics.Moves;

public class RazorShell extends Moves {
    public RazorShell(){
        this.name = "Razor Shell";
        this.type = "Water";
        this.power = 75;
        this.acc = 95;
        this.PP = 10;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
        this.StatchangeEnemy = true;
        this.affectsPhysDef = true;
        this.MultChange = -1;
        this.statChangeReqChance= true;
        this.StatChangeReq = 100;
        this.changeTypeName = " defense ";
        this.TMNum = 83;
    }
}
