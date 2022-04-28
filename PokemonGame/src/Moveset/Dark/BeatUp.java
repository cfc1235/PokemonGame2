package Moveset.Dark;

import BattleMechanics.Moves;

public class BeatUp extends Moves {
    public BeatUp(){
        this.name = "Beat Up";
        this.type = "Dark";
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 37;
    }
}
