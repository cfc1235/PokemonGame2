package Moveset.Water;

import BattleMechanics.Moves;

public class Whirlpool extends Moves {
    public Whirlpool(){
        this.name = "Whirlpool";
        this.type = "Water";
        this.power = 35;
        this.acc = 85;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.createsVortex = true;
        this.savedPP = this.PP;
        this.vortex = new BattleMechanics.Vortex.Whirlpool();
        this.TMNum = 36;
    }
}
