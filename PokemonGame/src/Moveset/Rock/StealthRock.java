package Moveset.Rock;

import BattleMechanics.Moves;

public class StealthRock extends Moves {
    public StealthRock(){
        this.name = "Stealth Rock";
        this.type = "Rock";
        this.PP = 20;
        this.savedPP = this.PP;
        this.TMNum = 176;
    }
}
