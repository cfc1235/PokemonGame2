package Moveset.Dark;

import BattleMechanics.Moves;

public class Crunch extends Moves {
    public Crunch(){
        this.name = "Crunch";
        this.type = "Dark";
        this.power = 80;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 132;
        this.statChangeReqChance = true;
        this.StatChangeReq = 20;
        this.StatchangeEnemy = true;
        this.affectsPhysDef = true;
        this.MultChange = -1;
        this.changeTypeName = "defense ";
        this.makesContact = true;
    }
}
