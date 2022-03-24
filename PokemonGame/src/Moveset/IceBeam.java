package Moveset;

import BattleMechanics.Moves;

public class IceBeam extends Moves {
    public IceBeam(){
        name = "Ice Beam";
        type = "Ice";
        power = 90;
        acc = 100;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 105;
        isSpecial = true;
        canFreeze = true;
        freezeChance = 10;
    }
}
