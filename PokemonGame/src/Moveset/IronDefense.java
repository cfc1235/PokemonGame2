package Moveset;

import BattleMechanics.Moves;

public class IronDefense extends Moves {
    public IronDefense(){
        name = "Iron Defense";
        type = "Steel";
        PP = 15;
        StateChangeAlly = true;
        affectsPhysDef =true;
        MultChange = 2;
        changeTypeName = " defense sharply ";
        savedPP = PP;
        TMNum = 146;
    }
}
