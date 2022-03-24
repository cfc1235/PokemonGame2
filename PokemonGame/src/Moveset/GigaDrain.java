package Moveset;

import BattleMechanics.Moves;

public class GigaDrain extends Moves {
    public GigaDrain(){
        name = "Giga Drain";
        type = "Grass";
        power = 75;
        acc = 100;
        PP = 10;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        DamBackHeal = true;
        BackHealAm = .5;
        isSpecial = true;
        TMNum = 28;
    }
}
