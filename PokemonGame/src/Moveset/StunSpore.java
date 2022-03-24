package Moveset;

import BattleMechanics.Moves;

public class StunSpore extends Moves {
    public StunSpore(){
        name = "Stun Spore";
        type = "Grass";
        PP = 30;
        acc = 75;
        onlyCanParalyze = true;
        CanMiss = true;
        savedPP = PP;
    }
}
