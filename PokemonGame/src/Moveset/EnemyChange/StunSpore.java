package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class StunSpore extends Moves {
    public StunSpore(){
        this.name = "Stun Spore";
        this.type = "Grass";
        this.PP = 30;
        this.acc = 75;
        this.onlyCanParalyze = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
    }
}
