package Moveset;

import BattleMechanics.Moves;

public class PetalBlizzard extends Moves {
    public PetalBlizzard(){
        name = "Petal Blizzard";
        type = "Grass";
        power = 90;
        acc = 100;
        PP = 15;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
    }
}
