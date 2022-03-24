package Moveset;

import BattleMechanics.Moves;

public class Slash extends Moves {
    public Slash(){
        name = "Slash";
        type = "Normal";
        power = 70;
        acc = 100;
        PP = 20;
        dealsDamage = true;
        CanMiss = true;
        affectsCrit = true;
        Critnum = 1;
        savedPP = PP;
    }
}
