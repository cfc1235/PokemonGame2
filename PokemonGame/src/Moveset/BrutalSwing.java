package Moveset;

import BattleMechanics.Moves;

public class BrutalSwing extends Moves {
    public BrutalSwing(){
        this.name = "Brutal Swing";
        this.type = "Dark";
        this.power = 60;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 97;
        this.makesContact =true;
    }
}
