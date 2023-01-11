package Moveset.Poison;

import BattleMechanics.Moves;

public class GunkShot extends Moves {
    public GunkShot(){
        this.name = "Gunk Shot";
        this.PP = 5;
        this.savedPP = this.PP;
        this.power = 120;
        this.type = "Poison";
        this.CanMiss = true;
        this.acc = 80;
        this.canPoison = true;
        this.poisonChance = 30;
        this.dealsDamage = true;
        this.TMNum = 173;
    }
}
