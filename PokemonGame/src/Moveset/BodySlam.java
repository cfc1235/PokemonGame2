package Moveset;

import BattleMechanics.Moves;

public class BodySlam extends Moves {
    public BodySlam(){
        name = "Body Slam";
        type = "Normal";
        power = 85;
        acc = 100;
        PP = 15;
        dealsDamage = true;
        CanMiss = true;
        savedPP = PP;
        makesContact = true;
        canParalyze = true;
        paralysisChance = 30;
        TMNum = 101;
    }
}
