package Moveset;

import BattleMechanics.Moves;

public class Entrainment extends Moves {
    public Entrainment(){
        this.name = "Entrainment";
        this.type = "Normal";
        this.PP = 15;
        this.savedPP = this.PP;
        this.giveEnemyAbility = true;
    }
}
