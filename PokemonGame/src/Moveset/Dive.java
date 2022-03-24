package Moveset;

import BattleMechanics.Moves;

public class Dive extends Moves {
    public Dive(){
        name = "Dive";
        type = "Water";
        power = 80;
        acc = 100;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        reqCharge = true;
        turnLength = 2;
        TMNum = 45;
        cannotBeAttacked = true;
        makesContact = true;
    }
}
