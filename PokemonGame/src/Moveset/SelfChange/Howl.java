package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Howl extends Moves {
    public Howl(){
        this.name = "Howl";
        this.type = "Normal";
        this.PP = 40;
        this.savedPP = this.PP;
        this.StateChangeAlly = true;
        this.affectsPhysAtt = true;
        this.MultChange = 1;
        this.changeTypeName = " attack ";
    }
}
