package Moveset;

import BattleMechanics.Moves;

public class Ember extends Moves {
    public Ember() {
        name = "Ember";
        type = "Fire";
        power = 40;
        acc = 100;
        PP = 25;
        savedPP = PP;
        dealsDamage = true;
        CanMiss = true;
        isSpecial = true;
    }
}
