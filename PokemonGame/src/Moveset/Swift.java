package Moveset;

import BattleMechanics.Moves;

public class Swift extends Moves {
    public Swift(){
        name = "Swift";
        type = "Normal";
        power = 60;
        PP = 20;
        dealsDamage = true;
        savedPP = PP;
        TMNum = 40;
        isSpecial = true;
        makesContact =true;
    }
}
