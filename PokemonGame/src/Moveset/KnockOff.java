package Moveset;

import BattleMechanics.Moves;

public class KnockOff extends Moves {
    public KnockOff(){
        this.name = "Knock Off";
        this.type = "Dark";
        this.power = 65;
        this.PP = 20;
        this.acc = 100;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
        this.enemyKnockOffItem = true;
    }
}
