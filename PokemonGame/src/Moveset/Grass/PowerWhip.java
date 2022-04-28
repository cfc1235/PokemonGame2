package Moveset.Grass;

import BattleMechanics.Moves;

public class PowerWhip extends Moves {
    public PowerWhip() {
        this.name = "Power Whip";
        this.type = "Grass";
        this.power = 120;
        this.acc = 85;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
        this.TMNum = 172;
    }
}
