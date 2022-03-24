package Moveset;

import BattleMechanics.Moves;

public class Fly extends Moves {
    public Fly(){
        name = "Fly";
        type = "Flying";
        power = 90;
        acc = 95;
        PP = 15;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        reqCharge = true;
        turnLength = 2;
        TMNum = 6;
        cannotBeAttacked = true;
        makesContact = true;
    }
}
