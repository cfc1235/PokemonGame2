package Moveset.Psychic;

import BattleMechanics.Moves;

public class Psybeam extends Moves {
    public Psybeam(){
        this.name = "Psybeam";
        this.type = "Psychic";
        this.power = 65;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP =  this.PP;
        this.canConfuse = true;
        this.confuseChance = 10;
        this.isSpecial = true;
    }
}
