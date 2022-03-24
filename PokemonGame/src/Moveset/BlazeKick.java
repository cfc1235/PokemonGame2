package Moveset;

import BattleMechanics.Moves;

public class BlazeKick extends Moves {
    public BlazeKick(){
        name = "Blaze Kick";
        type = "Fire";
        power = 85;
        acc = 90;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 141;
        canBurn = true;
        burnChance = 10;
        makesContact = true;
        Critnum = 1;
        affectsCrit = true;
    }
}
