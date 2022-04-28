package Moveset.SelfChange;

import BattleMechanics.Moves;

public class SwordsDance extends Moves {
    public SwordsDance(){
        this.name = "Swords Dance";
        this.type = "Normal";
        this.PP = 20;
        this.StateChangeAlly = true;
        this.affectsPhysAtt = true;
        this.MultChange = 2;
        this.changeTypeName = "attack sharply";
        this.savedPP = this.PP;
        this.TMNum = 100;
    }
}
