package Moveset.Fighting;

import BattleMechanics.Moves;

public class AuraSphere extends Moves {
    public AuraSphere(){
        this.name = "Aura Sphere";
        this.type = "Fighting";
        this.power = 80;
        this.PP = 20;
        this.dealsDamage = true;
        this.isSpecial = true;
        this.savedPP = this.PP;
        this.TMNum = 156;
    }
}
