package Moveset;

import BattleMechanics.Moves;

public class Substitute extends Moves {
    public Substitute() {
        name = "Substitute";
        createsSubstitute = true;
        type = "Normal";
        PP = 10;
        savedPP = PP;
        TMNum = 120;
    }
}
