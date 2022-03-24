package Moveset;

import BattleMechanics.Moves;

public class PetalDance extends Moves {
    public PetalDance(){
        selfConfuse = true;
        Outrage = true;
        OutrageMinTimer = 2;
        OutrageMaxTimer = 3;
        name = "Petal Dance";
        type = "Grass";
        power = 120;
        acc = 100;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        isSpecial = true;
        makesContact = true;
    }
}
