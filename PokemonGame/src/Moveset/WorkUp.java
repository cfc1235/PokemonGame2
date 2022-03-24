package Moveset;

import BattleMechanics.Moves;

public class WorkUp extends Moves {
    public WorkUp(){
        name = "Work Up";
        type = "Normal";
        PP = 30;
        StateChangeAlly = true;
        affectsPhysAtt = true;
        affectsSpecAtt = true;
        MultChange = 1;
        changeTypeName = "attack and special attack";
        savedPP = PP;
        TMNum = 185;
    }
}