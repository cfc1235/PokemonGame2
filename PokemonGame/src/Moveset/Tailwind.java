package Moveset;

import BattleMechanics.Moves;

public class Tailwind extends Moves {
    public Tailwind(){
        name = "Tailwind";
        type = "Flying";
        vortexSelf = true;
        PP = 15;
        createsVortex = true;
        savedPP = PP;
        vortex = new BattleMechanics.Vortex.Tailwind();
    }
}
