package Moveset;

import BattleMechanics.Moves;

public class Agility extends Moves {

    public Agility(){
        this.name = "Agility";
        this.type = "Psychic";
        this.PP = 30;
        this.savedPP = this.PP;
        this.StateChangeAlly = true;
        this.affectsSpeed = true;
        this.MultChange = 2;
        this.changeTypeName = " speed sharply ";
    }
}
