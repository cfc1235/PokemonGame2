package Moveset;

import BattleMechanics.Moves;

public class Acrobatics extends Moves {
    public Acrobatics(){
        name = "Acrobatics";
        type = "Flying";
        power = 55;
        acc = 100;
        PP = 15;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        makesContact = true;
        TMNum = 78;
    }
}
