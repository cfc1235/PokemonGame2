package Moveset;

import BattleMechanics.Moves;

public class Dig extends Moves {
    public Dig(){
        name = "Dig";
        type = "Ground";
        power = 80;
        acc = 100;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        reqCharge = true;
        turnLength = 2;
        TMNum = 15;
        cannotBeAttacked = true;
        makesContact = true;
    }
}
