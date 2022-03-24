package Moveset;

import BattleMechanics.Moves;

public class Tackle extends Moves {

    public Tackle(){
        name = "Tackle";
        type = "Normal";
        power = 40;
        acc = 100;
        PP = 35;
        dealsDamage = true;
        CanMiss = true;
        Healally = false;
        StatchangeEnemy = false;
        StateChangeAlly = false;
        isSpecial = false;
        savedPP = PP;
        makesContact = true;
    }
}
