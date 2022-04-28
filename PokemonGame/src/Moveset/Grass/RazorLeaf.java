package Moveset.Grass;

import BattleMechanics.Moves;

public class RazorLeaf extends Moves{

    public RazorLeaf() {
        this.name = "Razor Leaf";
        this.type = "Grass";
        this.power = 55;
        this.acc = 95;
        this.PP = 25;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.affectsCrit = true;
        this.Critnum = 1;
        this.savedPP = this.PP;
    }
}

