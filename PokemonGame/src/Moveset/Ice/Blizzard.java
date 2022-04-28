package Moveset.Ice;

import BattleMechanics.Moves;

public class Blizzard extends Moves {
    public Blizzard(){
        this.name = "Blizzard";
        this.type = "Ice";
        this.power = 110;
        this.acc = 70;
        this.PP = 5;
        this.isSpecial = true;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 106;
        this.canFreeze = true;
        this.freezeChance = 10;
    }
}
