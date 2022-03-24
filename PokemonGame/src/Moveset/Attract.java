package Moveset;

import BattleMechanics.Moves;

public class Attract extends Moves {
    public Attract(){
        name = "Attract";
        type = "Normal";
        PP = 15;
        dealsDamage = false;
        Healally = false;
        StatchangeEnemy = false;
        StateChangeAlly = false;
        canInfatuate = true;
        savedPP = PP;
        TMNum = 31;
        ignoreSubstitute = true;
    }
}
