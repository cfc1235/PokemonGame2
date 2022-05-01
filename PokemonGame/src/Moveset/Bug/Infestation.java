package Moveset.Bug;

import BattleMechanics.Moves;

public class Infestation extends Moves {

    public Infestation(){
        this.name = "Infestation";
        this.type = "Bug";
        this.isSpecial = true;
        this.causesOutrage = true;
        this.OutrageMaxTimer = 5;
        this.OutrageMinTimer = 4;
        this.acc = 100;
        this.CanMiss = true;
        this.PP = 20;
        this.savedPP = this.PP;
        this.power = 20;
        this.dealsDamage = true;
        this.TMNum = 383;
    }
}
