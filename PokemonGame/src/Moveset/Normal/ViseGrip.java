package Moveset.Normal;

import BattleMechanics.Moves;

public class ViseGrip extends Moves {
    public ViseGrip(){
        this.name = "Vise Grip";
        this.type = "Normal";
        this.power = 55;
        this.acc = 100;
        this.PP = 30;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
    }
}
