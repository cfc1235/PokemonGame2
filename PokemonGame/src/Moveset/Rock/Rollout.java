package Moveset.Rock;

import BattleMechanics.Moves;

public class Rollout extends Moves {

    public Rollout(){
        this.name = "Rollout";
        this.type = "Rock";
        this.Outrage = true;
        this.outrageTimer = 5;
        this.power = 30;
        this.PP = 20;
        this.savedPP = this.PP;
        this.acc = 90;
        this.CanMiss = true;
        this.makesContact = true;
    }
}
