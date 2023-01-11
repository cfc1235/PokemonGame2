package Moveset.Dark;

import BattleMechanics.Moves;

public class DarkestLariat extends Moves {
    public DarkestLariat(){
        this.name = "Darkest Lariat";
        this.type = "Dark";
        this.power = 85;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 194;
        this.ignoresDef = true;
        this.ignoresEvas = true;
        this.makesContact = true;
    }
}
