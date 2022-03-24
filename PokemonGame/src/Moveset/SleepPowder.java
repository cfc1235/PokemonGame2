package Moveset;

import BattleMechanics.Moves;

public class SleepPowder extends Moves{
    public SleepPowder() {
        name = "Sleep Powder";
        type = "Grass";
        PP = 35;
        acc = 75;
        onlyCanSleep = true;
        CanMiss = true;
        savedPP = PP;
    }
}
