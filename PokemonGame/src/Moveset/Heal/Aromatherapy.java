package Moveset.Heal;

import BattleMechanics.Moves;

public class Aromatherapy extends Moves {
    public Aromatherapy(){
        this.name = "Aromatherapy";
        this.ridsStatusEffects = true;
        this.type = "Grass";
        this.PP = 5;
        this.savedPP = this.PP;
    }
}
