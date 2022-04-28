package Moveset.OtherDamage;

import BattleMechanics.Moves;

public class ConfusionDamage extends Moves {
    public ConfusionDamage(){
        this.name = "Confusion Damage";
        this.PP = 1;
        this.dealsDamage = true;
        this.power = 40;
    }
}
