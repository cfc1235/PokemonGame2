package Moveset.Fire;

import BattleMechanics.Moves;

public class FirePunch extends Moves {
    public FirePunch(){
        this.name = "Fire Punch";
        this.type = "Fire";
        this.power = 75;
        this.acc = 100;
        this.PP = 15;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this. makesContact = true;
        this.canBurn = true;
        this.burnChance = 10;
        this.TMNum = 3;
    }
}
