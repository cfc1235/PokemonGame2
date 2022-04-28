package Moveset.Fire;

import BattleMechanics.Moves;

public class FlareBlitz extends Moves {
    public FlareBlitz(){
        this.name = "Flare Blitz";
        this.type = "Fire";
        this.power = 120;
        this.PP = 15;
        this.acc = 100;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.DamageSelf = true;
        this.recoil = .33;
        this.makesContact = true;
        this.canBurn = true;
        this.burnChance = 10;
        this.TMNum = 155;
    }
}
