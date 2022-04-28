package Moveset.Normal;

import BattleMechanics.Moves;

public class MegaKick extends Moves {
    public MegaKick(){
        this.name = "Mega Kick";
        this.type = "Normal";
        this.power = 120;
        this.PP = 5;
        this.acc = 75;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
        this.TMNum = 1;
    }
}
