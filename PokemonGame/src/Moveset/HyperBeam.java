package Moveset;

import BattleMechanics.Moves;

public class HyperBeam extends Moves {
    public HyperBeam(){
        name = "Hyper Beam";
        type = "Normal";
        power = 150;
        acc = 90;
        PP = 5;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 8;
        isSpecial = true;
        forcesSitOut = true;
    }
}
