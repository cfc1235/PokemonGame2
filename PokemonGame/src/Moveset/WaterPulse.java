package Moveset;

import BattleMechanics.Moves;

public class WaterPulse extends Moves {
    public WaterPulse(){
        name = "Water Pulse";
        type = "Water";
        power = 60;
        acc = 100;
        PP = 20;
        savedPP = PP;
        dealsDamage = true;
        CanMiss = true;
        isSpecial = true;
        canConfuse = true;
        confuseChance = 20;
    }
}
