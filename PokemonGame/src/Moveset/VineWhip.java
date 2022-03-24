package Moveset;

import BattleMechanics.Moves;

public class VineWhip extends Moves {
    public VineWhip(){
        name = "Vine Whip";
        type = "Grass";
        power = 45;
        acc = 100;
        PP = 25;
        dealsDamage = true;
        CanMiss = true;
        Healally = false;
        StatchangeEnemy = false;
        StateChangeAlly = false;
        isSpecial = false;
        savedPP = PP;
    }
}
