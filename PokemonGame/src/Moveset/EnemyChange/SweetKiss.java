package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class SweetKiss extends Moves {
    public SweetKiss(){
        this.name = "Sweet Kiss";
        this.type = "Fairy";
        this.canOnlyConfuse = true;
        this.CanMiss = true;
        this.acc = 75;
        this.PP = 10;
        this.savedPP = this.PP;
    }
}
