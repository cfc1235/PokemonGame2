package Moveset;

import BattleMechanics.Moves;

public class Amnesia extends Moves {
    public Amnesia(){
        name = "Amnesia";
        type = "Psychic";
        PP = 20;
        StateChangeAlly = true;
        affectsSpecAtt = true;
        MultChange = 2;
        changeTypeName = " special attack sharply";
        savedPP = PP;
        TMNum = 117;
    }
}
