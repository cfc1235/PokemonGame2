package Moveset.Heal;

import BattleMechanics.Moves;

public class Rest extends Moves {
    public Rest(){
        this.name = "Rest";
        this.type = "Psychic";
        this.PP = 10;
        this.dealsDamage = false;
        this.fullRestore = true;
        this.savedPP = this.PP;
        this.selfSleep = true;
        this.TMNum = 21;
    }
}
