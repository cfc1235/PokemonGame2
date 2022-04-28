package Moveset.Dark;

import BattleMechanics.Moves;

public class Fling extends Moves {
    public Fling(){
        this.name = "Fling";
        this.type = "Dark";
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 59;
    }
}
