package Moveset.Ice;

import BattleMechanics.Moves;

public class IceBeam extends Moves {
    public IceBeam(){
        this.name = "Ice Beam";
        this.type = "Ice";
        this.power = 90;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 105;
        this.isSpecial = true;
        this.canFreeze = true;
        this.freezeChance = 10;
    }
}
