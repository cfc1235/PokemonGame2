package Moveset;

import BattleMechanics.Moves;

public class Taunt extends Moves {

    public Taunt(){
        this.TMNum = 12;
        this.name = "Taunt";
        this.type = "Dark";
        this.PP = 20;
        this.savedPP = this.PP;
        this.causesOutrage = true;
        this.outrageTimer = 3;
    }
}
