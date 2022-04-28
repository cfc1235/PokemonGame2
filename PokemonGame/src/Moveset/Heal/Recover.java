package Moveset.Heal;

import BattleMechanics.Moves;

public class Recover extends Moves {
    public Recover(){
        this.Healally = true;
        this.PP = 10;
        this.savedPP = this.PP;
        this.HealAmount = .5;
        this.type = "Normal";
        this.name = "Recover";
    }
}
