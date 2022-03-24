package Moveset;

import BattleMechanics.Moves;

public class Extrasensory extends Moves {

    public Extrasensory(){
        this.name = "Extrasensory";
        this.dealsDamage = true;
        this.isSpecial = true;
        this.type = "Psychic";
        this.acc = 100;
        this.CanMiss = true;
        this.PP = 20;
        this.savedPP = this.PP;
        this.power = 80;
        this.canFlinch = true;
        this.FlinchChance = 10;
    }
}
