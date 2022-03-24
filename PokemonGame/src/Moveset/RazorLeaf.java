package Moveset;

import BattleMechanics.Moves;

public class RazorLeaf extends Moves{

    public RazorLeaf() {
        name = "Razor Leaf";
        type = "Grass";
        power = 55;
        acc = 95;
        PP = 25;
        dealsDamage = true;
        CanMiss = true;
        affectsCrit = true;
        Critnum = 1;
        savedPP = PP;
    }
}

