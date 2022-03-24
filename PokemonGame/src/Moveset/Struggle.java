package Moveset;

import BattleMechanics.Moves;

public class Struggle extends Moves {

    public Struggle(){
        name = "Struggle";
        type = "Normal";
        power = 50;
        PP = 1;
        dealsDamage = true;
        DamageSelf = true;
        recoil = .5;
        makesContact = true;
    }
}
