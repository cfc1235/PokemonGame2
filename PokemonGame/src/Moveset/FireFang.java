package Moveset;

import BattleMechanics.Moves;

public class FireFang extends Moves {
    public FireFang(){
        this.name = "Fire Fang";
        this.type = "Fire";
        this.power = 65;
        this.acc = 95;
        this.PP = 15;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
        this.canBurn = true;
        this.canFlinch = true;
        this.FlinchChance = 10;
        this.burnChance = 10;
        this.TMNum = 68;
    }
}
