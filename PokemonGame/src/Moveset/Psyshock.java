package Moveset;

import BattleMechanics.Moves;

public class Psyshock extends Moves {
    public Psyshock(){
        this.name = "Psyshock";
        this.type = "Psychic";
        this.power = 80;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.isSpecial = true;
        this.savedPP = this.PP;
    }
}
