package Moveset.Dragon;

import BattleMechanics.Moves;

public class Outrage extends Moves {
    public Outrage(){
        this.selfConfuse = true;
        this.Outrage = true;
        this.OutrageMinTimer = 2;
        this.OutrageMaxTimer = 3;
        this.name = "Outrage";
        this.type = "Dragon";
        this.power = 120;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.isSpecial = true;
        this.makesContact = true;
        this.TMNum = 124;
    }
}
