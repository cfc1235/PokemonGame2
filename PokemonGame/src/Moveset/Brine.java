package Moveset;

import BattleMechanics.Moves;

public class Brine extends Moves {
    public Brine(){
        name = "Brine";
        type = "Water";
        power = 65;
        PP = 10;
        acc = 100;
        dealsDamage = true;
        CanMiss = true;
        isSpecial = true;
        TMNum = 55;
    }
}
