package Moveset;

import BattleMechanics.Moves;

public class Safegaurd extends Moves {
    public Safegaurd(){
        name = "Safegaurd";
        type = "Normal";
        PP = 25;
        affectsStatChange = true;
        savedPP = PP;
        timerChange = 5;
        TMNum = 19;
    }
}
