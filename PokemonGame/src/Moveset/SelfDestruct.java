package Moveset;

import BattleMechanics.Moves;

public class SelfDestruct extends Moves {
    public SelfDestruct(){
        this.name = "Self Destruct";
        this.type = "Normal";
        this.power = 200;
        this.PP = 5;
        this.acc = 100;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.DamageSelf = true;
        this.recoil = 1;
        this.savedPP = this.PP;
    }

}
