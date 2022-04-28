package Moveset.Normal;

import BattleMechanics.Moves;

public class TakeDown extends Moves {
    public TakeDown() {
        this.name = "Take Down";
        this.type = "Normal";
        this.power = 90;
        this.PP = 20;
        this.acc = 80;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.DamageSelf = true;
        this.recoil = .25;
        this.savedPP = this.PP;
    }
}
