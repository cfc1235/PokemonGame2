package Moveset.Fire;

import BattleMechanics.Moves;

public class Flamethrower extends Moves {
    public Flamethrower(){
        this.name = "Flamethrower";
        this.type = "Fire";
        this.power = 90;
        this.acc = 100;
        this.PP = 15;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.canBurn = true;
        this.burnChance = 10;
        this.TMNum = 102;
    }
}
