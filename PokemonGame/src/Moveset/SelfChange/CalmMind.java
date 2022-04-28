package Moveset.SelfChange;

import BattleMechanics.Moves;

public class CalmMind extends Moves {

    public CalmMind(){
        this.name = "Calm Mind";
        this.type = "Psychic";
        this.PP = 20;
        this.savedPP = this.PP;
        this.StateChangeAlly = true;
        this.TMNum = 149;
        this.affectsSpecAtt = true;
        this.affectsSpecDef = true;
        this.MultChange = 1;
        this.changeTypeName = " special attack and special defense ";
    }
}
