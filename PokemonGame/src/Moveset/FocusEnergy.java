package Moveset;

import BattleMechanics.Moves;

public class FocusEnergy extends Moves {

    public FocusEnergy(){
        this.critUp = true;
        this.StateChangeAlly = true;
        this.timerChange = 5;
        this.changeTypeName = " critical hit multiplier ";
        this.MultChange = 1;
        this.name = "Focus Energy";
        this.PP = 30;
        this.type = "Normal";
    }
}
