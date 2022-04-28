package Moveset.SelfChange;

import BattleMechanics.Moves;

public class MagnetRise extends Moves {
    public MagnetRise(){
        this.name = "Magnet Rise";
        this.PP = 10;
        this.savedPP = this.PP;
        this.type = "Electric";
        this.causesLevitate = true;
        this.levitateTimer = 5;
    }
}
