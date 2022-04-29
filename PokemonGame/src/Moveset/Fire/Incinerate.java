package Moveset.Fire;

import BattleMechanics.Moves;

public class Incinerate extends Moves {
    public Incinerate(){
        this.name = "Incinerate";
        this.type = "Fire";
        this.power = 60;
        this.acc = 100;
        this.PP = 15;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.enemyKnockOffItem = true;
    }
}
