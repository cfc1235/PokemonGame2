package Moveset;

import BattleMechanics.Moves;

public class FirePunch extends Moves {
    public FirePunch(){
        name = "Fire Punch";
        type = "Fire";
        power = 75;
        acc = 100;
        PP = 15;
        savedPP = PP;
        dealsDamage = true;
        CanMiss = true;
        makesContact = true;
        canBurn = true;
        burnChance = 10;
        TMNum = 3;
    }
}
