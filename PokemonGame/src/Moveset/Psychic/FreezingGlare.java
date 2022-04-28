package Moveset.Psychic;

import BattleMechanics.Moves;

public class FreezingGlare extends Moves {
    public FreezingGlare(){
        this.name = "Freezing Glare";
        this.type = "Psychic";
        this.power = 90;
        this.acc = 100;
        this.PP = 10;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.canFreeze = true;
        this.freezeChance = 10;
    }
}
