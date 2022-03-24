package Moveset;

import BattleMechanics.Moves;

public class GyroBall extends Moves {
    public GyroBall(){
        name = "Gyro Ball";
        type = "Steel";
        acc = 100;
        PP = 5;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        makesContact = true;
        TMNum = 152;
    }
}
