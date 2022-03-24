package Moveset;

import BattleMechanics.Moves;

public class WillOWisp extends Moves {
    public WillOWisp(){
        this.name = "Will-O-Wisp";
        this.type = "Fire";
        this.PP = 15;
        this.acc = 85;
        this.onlyCanBurn = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 38;
    }
}
