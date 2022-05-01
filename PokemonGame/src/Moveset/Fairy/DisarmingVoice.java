package Moveset.Fairy;

import BattleMechanics.Moves;

public class DisarmingVoice extends Moves {
    public DisarmingVoice(){
        this.name = "Disarming Voice";
        this.type = "Fairy";
        this.power = 40;
        this.PP = 15;
        this.dealsDamage = true;
        this.savedPP = this.PP;
        this.isSpecial = true;
    }
}
