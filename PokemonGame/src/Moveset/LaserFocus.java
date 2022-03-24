package Moveset;

import BattleMechanics.Moves;

public class LaserFocus extends Moves {

    public LaserFocus(){
        this.name = "Laser Focus";
        this.type = "Normal";
        this.garaunteeCrit = true;
        this.PP = 30;
        this.savedPP = this.PP;
        this.StateChangeAlly = true;

    }
}
