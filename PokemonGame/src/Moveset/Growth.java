package Moveset;

import BattleMechanics.Moves;

public class Growth extends Moves {
    public Growth() {
        name = "Growth";
        type = "Normal";
        PP = 20;
        StateChangeAlly = true;
        affectsPhysAtt = true;
        affectsSpecAtt = true;
        MultChange = 1;
        changeTypeName = "attack and special attack";
        savedPP = PP;
    }
}
