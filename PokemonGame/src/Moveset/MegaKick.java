package Moveset;

import BattleMechanics.Moves;

public class MegaKick extends Moves {
    public MegaKick(){
        name = "Mega Kick";
        type = "Normal";
        power = 120;
        PP = 5;
        acc = 75;
        dealsDamage = true;
        CanMiss = true;
        makesContact = true;
        TMNum = 1;
    }
}
