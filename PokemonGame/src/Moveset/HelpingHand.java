package Moveset;

import BattleMechanics.Moves;

public class HelpingHand extends Moves {
    public HelpingHand(){
        this.name = "Helping Hand";
        this.type = "Normal";
        this.PP = 20;
        this.Charge = true;
        this.savedPP = this.PP;
        this.TMNum = 41;
    }
}
