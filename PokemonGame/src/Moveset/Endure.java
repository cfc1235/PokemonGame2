package Moveset;

import BattleMechanics.Moves;

public class Endure extends Moves {
    public Endure(){
        name = "Endure";
        PP = 10;
        savedPP = PP;
        type = "Normal";
        Endures = true;
        TMNum = 126;
    }
}
