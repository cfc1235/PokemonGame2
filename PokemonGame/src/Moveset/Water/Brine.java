package Moveset.Water;

import BattleMechanics.Moves;

public class Brine extends Moves {
    public Brine(){
        this.name = "Brine";
        this.type = "Water";
        this.power = 65;
        this.PP = 10;
        this.acc = 100;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.TMNum = 55;
    }
}
