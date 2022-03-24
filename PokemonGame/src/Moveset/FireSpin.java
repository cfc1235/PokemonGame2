package Moveset;

import BattleMechanics.Moves;

public class FireSpin extends Moves {
    public FireSpin(){
        name = "Fire Spin";
        type = "Fire";
        power = 35;
        acc = 85;
        PP = 15;
        dealsDamage = true;
        CanMiss = true;
        isSpecial = true;
        createsVortex = true;
        savedPP = PP;
        vortex = new BattleMechanics.Vortex.FireSpin();
        TMNum = 13;
    }
}
