package Moveset.SwapPower;

import BattleMechanics.Moves;

public class GuardSwap extends Moves {
    public GuardSwap(){
        this.name = "Guard Swap";
        this.type = "Psychic";
        this.swapPower = true;
        this.swapPhysDef = true;
        this.swapSpecDef = true;
        this.PP = 10;
        this.savedPP = this.PP;
        this.TMNum = 61;
    }
}
