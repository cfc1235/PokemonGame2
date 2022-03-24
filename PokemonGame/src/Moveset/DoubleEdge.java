package Moveset;

import BattleMechanics.Moves;

public class DoubleEdge extends Moves {
    public DoubleEdge(){
        name = "Take Down";
        type = "Normal";
        power = 120;
        PP = 15;
        acc = 100;
        dealsDamage = true;
        CanMiss = true;
        DamageSelf = true;
        recoil = .33;
        makesContact = true;
    }
}
