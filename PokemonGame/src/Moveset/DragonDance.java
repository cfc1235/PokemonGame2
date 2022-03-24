package Moveset;

import BattleMechanics.Moves;

public class DragonDance extends Moves {
    public DragonDance(){
        name = "Dragon Dance";
        type = "Dragon";
        PP = 20;
        StateChangeAlly = true;
        affectsPhysAtt = true;
        affectsSpeed = true;
        MultChange = 1;
        changeTypeName = "attack and speed ";
        savedPP = PP;
        TMNum = 151;
    }
}
