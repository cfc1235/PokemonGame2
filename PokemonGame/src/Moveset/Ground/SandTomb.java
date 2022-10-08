package Moveset.Ground;

import BattleMechanics.Moves;

public class SandTomb extends Moves {
    public SandTomb(){
        this.name = "Sand Tomb";
        this.type = "Ground";
        this.power = 35;
        this.acc = 85;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.createsVortex = true;
        this.savedPP = this.PP;
        this.vortex = new BattleMechanics.Vortex.SandTomb();
        this.TMNum = 49;
    }
}
