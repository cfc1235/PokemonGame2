package Moveset.Steel;

import BattleMechanics.Moves;

public class Autotomize extends Moves {

    public Autotomize(){
        this.name = "Autotomize";
        this.type = "Steel";
        this.StateChangeAlly = true;
        this.MultChange = 2;
        this.affectsSpeed = true;
        this.PP = 15;
        this.savedPP = this.PP;
    }
}
