package Moveset;

import BattleMechanics.Moves;

public class ThunderWave extends Moves {
    public ThunderWave(){
        this.name = "Thunder Wave";
        this.type = "Electric";
        this.TMNum = 73;
        this.onlyCanParalyze = true;
        this.CanMiss = true;
        this.acc = 90;
        this.PP = 20;
        this.savedPP = this.PP;
    }
}
