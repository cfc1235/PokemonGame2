package Moveset.SelfChange;

import BattleMechanics.Moves;

public class Endure extends Moves {
    public Endure(){
        this.name = "Endure";
        this.PP = 10;
        this.savedPP = this.PP;
        this.type = "Normal";
        this.Endures = true;
        this.TMNum = 126;
    }
}
