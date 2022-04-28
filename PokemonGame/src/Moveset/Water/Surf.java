package Moveset.Water;

import BattleMechanics.Moves;

public class Surf extends Moves {
    public Surf(){
        this.name = "Surf";
        this.type = "Water";
        this.power = 90;
        this.PP = 15;
        this.acc = 100;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.TMNum = 104;
    }
}
