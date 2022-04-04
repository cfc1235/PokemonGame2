package Moveset;

import BattleMechanics.Moves;

public class MegaPunch extends Moves {
    public MegaPunch(){
        this.name = "Mega Punch";
        this.type = "Normal";
        this.power = 80;
        this.PP = 20;
        this.acc = 85;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
        this.TMNum = 0;
    }
}
