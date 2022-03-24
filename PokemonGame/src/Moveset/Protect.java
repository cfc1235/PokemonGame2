package Moveset;

import BattleMechanics.Moves;

public class Protect extends Moves {
    public Protect(){
        fullDef = true;
        type = "Normal";
        PP = 10;
        savedPP = PP;
        TMNum = 25;
    }
}
