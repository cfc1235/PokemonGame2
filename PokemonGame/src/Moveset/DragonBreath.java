package Moveset;

import BattleMechanics.Moves;

public class DragonBreath extends Moves {
    public DragonBreath(){
        name = "Dragon Breath";
        type = "Dragon";
        power = 60;
        acc = 100;
        PP = 20;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        canParalyze = true;
        paralysisChance = 30;
        isSpecial = true;
    }
}
