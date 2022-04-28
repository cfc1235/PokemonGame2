package Moveset.Fighting;

import BattleMechanics.Moves;

public class BodyPress extends Moves {
    public BodyPress(){
        this.name = "Body Press";
        this.type = "Fighting";
        this.power = 80;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 199;
        this.makesContact =true;
    }
}
