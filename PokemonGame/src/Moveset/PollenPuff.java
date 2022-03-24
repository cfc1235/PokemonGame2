package Moveset;

import BattleMechanics.Moves;

public class PollenPuff extends Moves {
    public PollenPuff(){
        healOrDamage = true;
        name = "Pollen Puff";
        type = "Bug";
        power = 90;
        acc = 100;
        PP = 15;
        HealAmount = .5;
        CanMiss = true;
        savedPP = PP;
        TMNum = 196;
        isSpecial = true;
    }
}
