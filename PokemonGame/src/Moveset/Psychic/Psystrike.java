package Moveset.Psychic;

import BattleMechanics.Moves;

public class Psystrike extends Moves {
    public Psystrike(){
        this.name = "Psystrike";
        this.type = "Psychic";
        this.power = 100;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.isSpecial = true;
        this.savedPP = this.PP;
    }
}
