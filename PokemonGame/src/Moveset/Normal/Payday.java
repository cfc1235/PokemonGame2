package Moveset.Normal;

import BattleMechanics.Moves;

public class Payday extends Moves {
    public Payday(){
        this.name = "Pay Day";
        this.type = "Normal";
        this.power = 40;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 2;
    }
}
