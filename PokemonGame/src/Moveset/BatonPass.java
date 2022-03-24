package Moveset;

import BattleMechanics.Moves;

public class BatonPass extends Moves {
    public BatonPass(){
        name = "Baton Pass";
        type = "Normal";
        PP = 40;
        batonPass = true;
        savedPP = PP;
        TMNum = 129;
    }
}
