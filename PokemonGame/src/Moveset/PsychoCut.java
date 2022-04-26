package Moveset;

import BattleMechanics.Moves;

public class PsychoCut extends Moves {
    public PsychoCut(){
        this.name = "Psycho Cut";
        this.type = "Psychic";
        this.power = 70;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.affectsCrit = true;
        this.Critnum = 1;
        this.savedPP = this.PP;
    }
}
