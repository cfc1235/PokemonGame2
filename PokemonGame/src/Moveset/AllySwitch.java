package Moveset;

import BattleMechanics.Moves;

public class AllySwitch extends Moves {
    public AllySwitch(){
        this.name = "Ally Switch";
        this.PP = 15;
        this.savedPP = this.PP;
        this.type = "Psychic";
        this.selfWhirlwindEffect = true;
    }
}
