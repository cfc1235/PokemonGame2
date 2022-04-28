package Moveset.Ground;

import BattleMechanics.Moves;

public class StompingTantrum extends Moves {
    public StompingTantrum(){
        this.TMNum = 98;
        this.name = "Stomping Tantrum";
        this.type = "Ground";
        this.power = 75;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
    }
}
