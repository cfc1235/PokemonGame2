package Moveset;

import BattleMechanics.Moves;

public class ScaryFace extends Moves {
    public ScaryFace(){
        name = "Scary Face";
        type = "Normal";
        PP = 10;
        StatchangeEnemy = true;
        affectsSpeed = true;
        MultChange = -2;
        changeTypeName = "speed harshly ";
        savedPP = PP;
        TMNum = 26;
    }
}
