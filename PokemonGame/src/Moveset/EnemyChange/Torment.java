package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class Torment extends Moves {

    public Torment(){
        this.type = "Dark";
        this.name = "Torment";
        this.CanMiss = false;
        this.PP = 15;
        this.savedPP = this.PP;
        this.causesTorment = true;
        this.tormentTimer = 2;
        this.TMNum = 241;
    }
}
