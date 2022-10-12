package Moveset.Grass;

import BattleMechanics.Moves;

public class WoodHammer extends Moves {
    public WoodHammer(){
        this.name = "Wood Hammer";
        this.type = "Grass";
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
