package Moveset;

import BattleMechanics.Moves;

public class VoltSwitch extends Moves {
    public VoltSwitch(){
        this.name = "Volt Switch";
        this.type = "Electric";
        this.power = 70;
        this.acc = 100;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 243;
        this.isSpecial =true;
        this.selfWhirlwindEffect = true;
    }
}
