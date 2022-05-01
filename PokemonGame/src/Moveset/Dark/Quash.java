package Moveset.Dark;

import BattleMechanics.Moves;

public class Quash extends Moves {
    public Quash(){
        this.name = "Quash";
        this.CanMiss = false;
        this.type = "Dark";
        this.PP = 15;
        this.savedPP = this.PP;
        this.TMNum = 360;
    }
}
