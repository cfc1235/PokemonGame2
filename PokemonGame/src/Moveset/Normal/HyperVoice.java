package Moveset.Normal;

import BattleMechanics.Moves;

public class HyperVoice extends Moves {

    public HyperVoice(){
        this.power = 90;
        this.CanMiss = true;
        this.dealsDamage = true;
        this.acc = 100;
        this.PP = 10;
        this.savedPP = this.PP;
        this.isSpecial = true;
        this.name = "Hyper Voice";
        this.type = "Normal";
        this.TMNum = 142;
    }
}
