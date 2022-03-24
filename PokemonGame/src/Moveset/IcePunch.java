package Moveset;

import BattleMechanics.Moves;

public class IcePunch extends Moves {
    public IcePunch(){
        name = "Ice Punch";
        type = "Ice";
        power = 75;
        acc = 100;
        PP = 15;
        savedPP = PP;
        dealsDamage = true;
        CanMiss = true;
        makesContact = true;
        canFreeze = true;
        freezeChance = 10;
        TMNum = 4;
    }
}
