package Moveset;

import BattleMechanics.Moves;

public class PsychicFangs extends Moves {
    public PsychicFangs(){
        this.name = "Psychic Fangs";
        this.type = "Psychic";
        this.power = 85;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 197;
        this.makesContact =true;
        this.breaksBarriers = true;
    }
}
