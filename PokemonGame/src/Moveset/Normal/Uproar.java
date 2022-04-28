package Moveset.Normal;

import BattleMechanics.Moves;

public class Uproar extends Moves {

    public Uproar(){
        this.name = "Uproar";
        this.type = "Normal";
        this.Outrage = true;
        this.OutrageMaxTimer = 3;
        this.OutrageMinTimer = 3;
        this.isSpecial = true;
        this.dealsDamage = true;
        this.power = 90;
        this.CanMiss = true;
        this.acc = 100;
        this.PP = 10;
        this.savedPP = this.PP;
        this.TMNum = 135;
    }
}
