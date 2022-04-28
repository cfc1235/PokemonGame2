package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class Taunt extends Moves {

    public Taunt(){
        this.name = "Taunt";
        this.type = "Dark";
        this.PP = 20;
        this.savedPP = this.PP;
        this.causesOutrage = true;
        this.outrageTimer = 3;
        this.TMNum = 137;
    }
}
