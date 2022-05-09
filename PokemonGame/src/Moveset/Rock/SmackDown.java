package Moveset.Rock;

import BattleMechanics.Moves;
public class SmackDown extends Moves {
    public SmackDown(){
        this.name = "Smack Down";
        this.type = "Rock";
        this.power = 50;
        this.acc = 100;
        this.PP = 15;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.TMNum = 343;
    }
}
