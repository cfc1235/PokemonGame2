package Moveset.Poison;

import BattleMechanics.Moves;

public class ToxicThread extends Moves {

    public ToxicThread(){
        this.type = "Poison";
        this.PP = 20;
        this.canPoison = true;
        this.CanMiss = true;
        this.acc = 100;
        this.poisonChance = 100;
        this.onlyCanPoison = true;
        this.name = "Toxic Thread";
        this.savedPP = this.PP;
        this.StatchangeEnemy = true;
        this.affectsSpeed = true;
        this.MultChange = -1;
        this.changeTypeName = " speed ";
    }
}
