package Moveset.SwitchPoke;

import BattleMechanics.Moves;

public class BatonPass extends Moves {
    public BatonPass(){
        this.name = "Baton Pass";
        this.type = "Normal";
        this.PP = 40;
        this.batonPass = true;
        this.savedPP = this.PP;
        this.TMNum = 129;
    }
}
