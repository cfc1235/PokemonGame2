package Moveset;

import BattleMechanics.Moves;

public class Rest extends Moves {
    public Rest(){
        name = "Rest";
        type = "Psychic";
        PP = 10;
        dealsDamage = false;
        fullRestore = true;
        savedPP = PP;
        selfSleep = true;
        TMNum = 21;
    }
}
