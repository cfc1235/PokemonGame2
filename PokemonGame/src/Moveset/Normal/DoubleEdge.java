package Moveset.Normal;

import BattleMechanics.Moves;

public class DoubleEdge extends Moves {
    public DoubleEdge(){
        this.name = "Take Down";
        this.type = "Normal";
        this.power = 120;
        this.PP = 15;
        this.acc = 100;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.DamageSelf = true;
        this.recoil = .33;
        this.makesContact = true;
    }
}
