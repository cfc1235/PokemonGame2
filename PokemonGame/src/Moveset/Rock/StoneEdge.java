package Moveset.Rock;

import BattleMechanics.Moves;

public class StoneEdge extends Moves {
    public StoneEdge(){
        this.name = "Stone Edge";
        this.type = "Rock";
        this.power = 100;
        this.acc = 80;
        this.PP = 5;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.affectsCrit = true;
        this.Critnum = 1;
        this.TMNum = 175;
    }
}
