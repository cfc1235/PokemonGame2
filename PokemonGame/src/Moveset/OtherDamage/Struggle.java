package Moveset.OtherDamage;

import BattleMechanics.Moves;

public class Struggle extends Moves {

    public Struggle(){
        this.name = "Struggle";
        this.type = "Normal";
        this.power = 50;
        this.PP = 1;
        this.dealsDamage = true;
        this.DamageSelf = true;
        this.recoil = .5;
        this.makesContact = true;
    }
}
