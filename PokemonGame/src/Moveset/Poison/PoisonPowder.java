package Moveset.Poison;

import BattleMechanics.Moves;

public class PoisonPowder extends Moves {
    public PoisonPowder() {
        this.name = "Poison Powder";
        this.type = "Poison";
        this.PP = 35;
        this.acc = 75;
        this.onlyCanPoison = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
    }
}
