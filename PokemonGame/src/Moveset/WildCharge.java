package Moveset;

import BattleMechanics.Moves;

public class WildCharge extends Moves {
    public WildCharge(){
        this.name = "Wild Charge";
        this.type = "Electric";
        this.power = 90;
        this.CanMiss = true;
        this.acc = 100;
        this.makesContact = true;
        this.isSpecial = false;
        this.DamageSelf = true;
        this.recoil = .25;
        this.PP = 15;
        this.savedPP = this.PP;
    }
}
