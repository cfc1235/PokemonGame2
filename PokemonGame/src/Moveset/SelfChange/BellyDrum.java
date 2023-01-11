package Moveset.SelfChange;

import BattleMechanics.Moves;

public class BellyDrum extends Moves {
    public BellyDrum(){
        this.name = "Belly Drum";
        this.type = "Normal";
        this.PP = 10;
        this.StateChangeAlly = true;
        this.affectsPhysAtt = true;
        this.MultChange = 6;
        this.changeTypeName = " attack ";
        this.savedPP = this.PP;
    }
}
