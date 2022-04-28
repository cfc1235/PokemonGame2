package Moveset.Fire;

import BattleMechanics.Moves;

public class Ember extends Moves {
    public Ember() {
        this.name = "Ember";
        this.type = "Fire";
        this.power = 40;
        this.acc = 100;
        this.PP = 25;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
    }
}
