package Moveset.Water;

import BattleMechanics.Moves;

public class AquaTail extends Moves{
    public AquaTail(){
        this.name = "Aqua Tail";
        this.type = "Water";
        this.power = 90;
        this.PP = 10;
        this.acc = 90;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
    }
}
