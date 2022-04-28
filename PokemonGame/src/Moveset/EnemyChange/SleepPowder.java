package Moveset.EnemyChange;

import BattleMechanics.Moves;

public class SleepPowder extends Moves{
    public SleepPowder() {
        this.name = "Sleep Powder";
        this.type = "Grass";
        this.PP = 35;
        this.acc = 75;
        this.onlyCanSleep = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
    }
}
