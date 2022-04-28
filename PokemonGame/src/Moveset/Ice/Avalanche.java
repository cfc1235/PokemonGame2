package Moveset.Ice;

import BattleMechanics.Moves;

public class Avalanche extends Moves {
    public Avalanche(){
        this.name = "Avalanche";
        this.type = "Ice";
        this.acc = 100;
        this.CanMiss = true;
        this.PP = 10;
        this.savedPP = this.PP;
        this.power = 60;
        this.makesContact = true;
        this.TMNum = 64;
    }
}
