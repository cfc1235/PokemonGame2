package Moveset;

import BattleMechanics.Moves;

public class Psybeam extends Moves {
    public Psybeam(){
        name = "Psybeam";
        type = "Psychic";
        power = 65;
        acc = 100;
        PP = 20;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        canConfuse = true;
        confuseChance = 10;
        isSpecial = true;
    }
}
