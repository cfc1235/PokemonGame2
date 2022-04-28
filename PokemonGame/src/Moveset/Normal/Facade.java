package Moveset.Normal;

import BattleMechanics.Moves;

public class Facade extends Moves {
    public Facade(){
        this.name = "Facade";
        this.type = "Normal";
        this.power = 70;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 39;
        this.makesContact =true;
    }
}
