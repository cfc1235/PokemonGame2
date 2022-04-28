package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Amnesia extends Moves {
    public Amnesia(){
        this.name = "Amnesia";
        this.type = "Psychic";
        this.PP = 20;
        this.StateChangeAlly = true;
        this.affectsSpecAtt = true;
        this.MultChange = 2;
        this.changeTypeName = " special attack sharply";
        this.savedPP = this.PP;
        this.TMNum = 117;
    }
}
