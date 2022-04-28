package Moveset.SelfChange;

import BattleMechanics.Moves;

public class QuiverDance extends Moves {
    public QuiverDance(){
        this.name = "Quiver Dance";
        this.type = "Bug";
        this.PP = 20;
        this.StateChangeAlly = true;
        this.affectsSpecDef = true;
        this.affectsSpecAtt =true;
        this.affectsSpeed = true;
        this.MultChange = 1;
        this.changeTypeName = " special attack, special defense, and speed ";
        this.savedPP = this.PP;
    }
}
