package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Transform extends Moves {
    public Transform(){
        this.name = "Transform";
        this.type = "Normal";
        this.PP = 10;
        this.savedPP = this.PP;
    }
}
