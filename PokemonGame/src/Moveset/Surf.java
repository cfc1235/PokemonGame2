package Moveset;

import BattleMechanics.Moves;

public class Surf extends Moves {
    public Surf(){
        name = "Surf";
        type = "Water";
        power = 90;
        PP = 15;
        acc = 100;
        dealsDamage = true;
        CanMiss = true;
        isSpecial = true;
        TMNum = 104;
    }
}
