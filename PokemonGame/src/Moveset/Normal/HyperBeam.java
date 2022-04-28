package Moveset.Normal;

import BattleMechanics.Moves;

public class HyperBeam extends Moves {
    public HyperBeam(){
        this.name = "Hyper Beam";
        this.type = "Normal";
        this.power = 150;
        this.acc = 90;
        this.PP = 5;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = PP;
        this.TMNum = 8;
        this.isSpecial = true;
        this.forcesSitOut = true;
    }
}
