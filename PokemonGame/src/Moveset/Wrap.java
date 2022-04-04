package Moveset;

import BattleMechanics.Moves;

public class Wrap extends Moves {
    public Wrap(){
        this.name = "Fire Spin";
        this.type = "Fire";
        this.power = 35;
        this.acc = 85;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.createsVortex = true;
        this.savedPP = this.PP;
        this.vortex = new BattleMechanics.Vortex.Wrap();
    }
}
