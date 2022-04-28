package Moveset.Ground;

import BattleMechanics.Moves;

public class MudSlap extends Moves {
    public MudSlap(){
        this.name = "Mud Slap";
        this.type = "Ground";
        this.power = 20;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.StatchangeEnemy = true;
        this.affectsAcc = true;
        this.MultChange = -1;
        this.changeTypeName = " accuracy ";
        this.isSpecial = true;
    }
}
