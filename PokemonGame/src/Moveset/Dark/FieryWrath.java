package Moveset.Dark;

import BattleMechanics.Moves;

public class FieryWrath extends Moves {
    public FieryWrath(){
        this.name = "Fiery Wrath";
        this.type = "Dark";
        this.power = 90;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.canFlinch = true;
        this.FlinchChance = 20;
        this.makesContact = true;
    }
}
