package Moveset.SwapPower;

import BattleMechanics.Moves;

public class PowerSwap extends Moves {
    public PowerSwap(){
        this.name = "Power Swap";
        this.type = "Psychic";
        this.swapPower = true;
        this.swapPhysAtt = true;
        this.swapSpecAtt = true;
        this.PP = 10;
        this.savedPP = this.PP;
        this.TMNum = 60;
    }
}
