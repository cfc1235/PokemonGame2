package Moveset;

import BattleMechanics.Moves;

public class Confusion extends Moves {
    public Confusion(){
        name = "Confusion";
        type = "Psychic";
        power = 50;
        acc = 100;
        PP = 25;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        canConfuse = true;
        confuseChance = 10;
        isSpecial = true;
    }
}
