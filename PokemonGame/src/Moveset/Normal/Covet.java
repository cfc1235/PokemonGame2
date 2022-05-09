package Moveset.Normal;

import BattleMechanics.Moves;

public class Covet extends Moves {
    public Covet(){
        this.name = "Covet";
        this.type = "Normal";
        this.power = 60;
        this.acc = 100;
        this.PP = 25;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact =true;
        this.takeItem = true;
    }
}
