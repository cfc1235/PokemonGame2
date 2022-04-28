package Moveset.SwitchPoke;

import BattleMechanics.Moves;

public class Whirlwind extends Moves {
    public Whirlwind(){
        this.name = "Whirlwind";
        this.whirlwindEffect = true;
        this.ignoreSubstitute = true;
        this.type = "Normal";
        this.PP = 20;
        this.savedPP = PP;
    }
}
