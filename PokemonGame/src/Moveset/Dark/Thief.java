package Moveset.Dark;

import BattleMechanics.Moves;

public class Thief extends Moves {
    public Thief(){
        this.name = "Thief";
        this.type = "Dark";
        this.power = 60;
        this.acc = 100;
        this.PP = 25;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 23;
        this.makesContact =true;
        this.takeItem = true;
    }
}
