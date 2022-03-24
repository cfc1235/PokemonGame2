package Moveset;

import BattleMechanics.Moves;

public class FlareBlitz extends Moves {
    public FlareBlitz(){
        name = "Flare Blitz";
        type = "Fire";
        power = 120;
        PP = 15;
        acc = 100;
        dealsDamage = true;
        CanMiss = true;
        DamageSelf = true;
        recoil = .33;
        makesContact = true;
        canBurn = true;
        burnChance = 10;
        TMNum = 155;
    }
}
