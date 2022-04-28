package Moveset.Heal;

import BattleMechanics.Moves;

public class Roost extends Moves {

    public Roost(){
        this.Healally = true;
        this.PP = 10;
        this.savedPP = this.PP;
        this.HealAmount = .5;
        this.type = "Flying";
        this.name = "Roost";
        this.TMNum = 251;
    }
}
