package Moveset;

import BattleMechanics.Moves;

public class MegaPunch extends Moves {
    public MegaPunch(){
        name = "Mega Punch";
        type = "Normal";
        power = 80;
        PP = 20;
        acc = 85;
        dealsDamage = true;
        CanMiss = true;
        makesContact = true;
        TMNum = 0;
    }
}
