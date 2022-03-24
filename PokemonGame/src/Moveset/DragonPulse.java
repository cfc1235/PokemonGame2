package Moveset;

import BattleMechanics.Moves;

public class DragonPulse extends Moves {
    public DragonPulse(){
        name = "Dragon Pulse";
        type = "Dragon";
        power = 85;
        acc = 100;
        PP = 10;
        isSpecial = true;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        TMNum = 162;
    }
}
