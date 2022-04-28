package Moveset.Bug;

import BattleMechanics.Moves;

public class PollenPuff extends Moves {
    public PollenPuff(){
        this.healOrDamage = true;
        this.name = "Pollen Puff";
        this.type = "Bug";
        this.power = 90;
        this.acc = 100;
        this.PP = 15;
        this.HealAmount = .5;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 196;
        this.isSpecial = true;
    }
}
