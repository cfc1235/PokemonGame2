package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Minimize extends Moves {
    public Minimize(){
        this.name = "Minimize";
        this.type = "Normal";
        this.PP = 10;
        this.savedPP = this.PP;
        this.StateChangeAlly = true;
        this.affectsEv = true;
        this.MultChange = 2;
        this.changeTypeName = " evasion sharply ";
    }
}
