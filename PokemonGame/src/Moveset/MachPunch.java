package Moveset;

import BattleMechanics.Moves;

public class MachPunch extends Moves {

    public MachPunch(){
        this.name = "Mach Punch";
        this.power = 40;
        this.dealsDamage = true;
        this.goesFirst = true;
        this.CanMiss = true;
        this.acc = 100;
        this.PP = 30;
        this.savedPP = this.PP;
        this.type = "Fighting";
        this.makesContact = true;
    }
}
