package Moveset;

import BattleMechanics.Moves;

public class Whirlpool extends Moves {
    public Whirlpool(){
        name = "Whirlpool";
        type = "Water";
        power = 35;
        acc = 85;
        PP = 15;
        dealsDamage = true;
        CanMiss = true;
        isSpecial = true;
        createsVortex = true;
        savedPP = PP;
        vortex = new BattleMechanics.Vortex.Whirlpool();
        TMNum = 36;
    }
}
