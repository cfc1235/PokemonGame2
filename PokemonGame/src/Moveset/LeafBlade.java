package Moveset;

import BattleMechanics.Moves;

public class LeafBlade extends Moves {
    public LeafBlade() {
        this.name = "Leaf Blade";
        this.type = "Grass";
        this.power = 90;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.affectsCrit = true;
        this.Critnum = 1;
        this.savedPP = this.PP;
        this.makesContact = true;
        this.TMNum = 150;
    }
}
