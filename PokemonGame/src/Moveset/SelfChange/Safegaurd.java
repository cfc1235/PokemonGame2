package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Safegaurd extends Moves {
    public Safegaurd(){
        this.name = "Safegaurd";
        this.type = "Normal";
        this.PP = 25;
        this.affectsStatChange = true;
        this.savedPP = this.PP;
        this.timerChange = 5;
        this.TMNum = 19;
    }
}
