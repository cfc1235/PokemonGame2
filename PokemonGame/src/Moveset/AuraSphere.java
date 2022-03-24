package Moveset;

import BattleMechanics.Moves;

public class AuraSphere extends Moves {
    public AuraSphere(){
        name = "Aura Sphere";
        type = "Fighting";
        power = 80;
        PP = 20;
        dealsDamage = true;
        isSpecial = true;
        savedPP = PP;
        TMNum = 156;
    }
}
