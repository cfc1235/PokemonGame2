package Moveset.Dark;

import BattleMechanics.Moves;

public class FoulPlay extends Moves {
    public FoulPlay(){
        this.name = "Foul Play";
        this.type = "Dark";
        this.power = 95;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 181;
        this.makesContact = true;
    }
}
