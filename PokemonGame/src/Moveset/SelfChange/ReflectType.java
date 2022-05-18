package Moveset.SelfChange;

import BattleMechanics.Moves;

public class ReflectType extends Moves {
    public ReflectType(){
        this.name = "Reflect Type";
        this.type = "Normal";
        this.PP = 15;
        this.savedPP = this.PP;
        this.resetsType = true;
        this.StateChangeAlly = true;
    }
}
