package Moveset.Normal;

import BattleMechanics.Moves;

public class SleepTalk extends Moves {
    public SleepTalk(){
        this.name = "Sleep Talk";
        this.PP = 10;
        this.savedPP = this.PP;
        this.type = "Normal";
        this.TMNum = 127;
    }
}
