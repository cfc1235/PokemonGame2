package Moveset.SelfChange;

import BattleMechanics.Moves;

public class MagicCoat extends Moves {
    public MagicCoat(){
        this.name = "Magic Coat";
        this.PP = 15;
        this.type = "Psychic";
        this.savedPP = this.PP;
        this.protectsFromStatChanges = 5;
    }
}
