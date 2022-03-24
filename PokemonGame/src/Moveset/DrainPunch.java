package Moveset;

import BattleMechanics.Moves;

public class DrainPunch extends Moves {

    public DrainPunch(){
        this.name = "Drain Punch";
        this.type = "Fighting";
        this.power = 75;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 260;
        this.makesContact = true;
        this.DamBackHeal = true;
        this.BackHealAm = .5;
    }
}
