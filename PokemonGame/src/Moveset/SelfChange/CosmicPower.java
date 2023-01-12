package Moveset.SelfChange;

import BattleMechanics.Moves;

public class CosmicPower extends Moves {
    public CosmicPower(){
        this.name = "Cosmic Power";
        this.type = "Psychic";
        this.PP = 20;
        this.StateChangeAlly = true;
        this.affectsPhysDef = true;
        this.affectsSpecDef = true;
        this.MultChange = 1;
        this.changeTypeName = "defense and special defense ";
        this.savedPP = this.PP;
        this.TMNum = 144;
    }
}
