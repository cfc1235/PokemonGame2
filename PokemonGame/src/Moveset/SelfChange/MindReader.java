package Moveset.SelfChange;

import BattleMechanics.Moves;

public class MindReader extends Moves {
    public MindReader(){
        this.name = "Mind Reader";
        this.type = "Psychic";
        this.PP = 5;
        this.savedPP = this.PP;
        this.causesNoMiss = true;
    }
}
