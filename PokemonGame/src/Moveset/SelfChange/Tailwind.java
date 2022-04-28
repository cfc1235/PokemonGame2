package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Tailwind extends Moves {
    public Tailwind(){
        this.name = "Tailwind";
        this.type = "Flying";
        this.vortexSelf = true;
        this.PP = 15;
        this.createsVortex = true;
        this.savedPP = this.PP;
        this.vortex = new BattleMechanics.Vortex.Tailwind();
    }
}
