package Moveset.Psychic;

import BattleMechanics.Moves;

public class Confusion extends Moves {
    public Confusion(){
        this.name = "Confusion";
        this.type = "Psychic";
        this.power = 50;
        this.acc = 100;
        this.PP = 25;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.canConfuse = true;
        this.confuseChance = 10;
        this.isSpecial = true;
    }
}
