package Moveset.Fire;

import BattleMechanics.Moves;

public class Inferno extends Moves {
    public Inferno(){
        this.name = "Inferno";
        this.type = "Fire";
        this.power = 100;
        this.acc = 50;
        this.PP = 5;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.canBurn = true;
        this.burnChance = 100;
    }
}
