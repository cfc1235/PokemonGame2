package Moveset.Normal;

import BattleMechanics.Moves;

public class Thrash extends Moves {
    public Thrash(){
        this.selfConfuse = true;
        this.Outrage = true;
        this.OutrageMinTimer = 2;
        this.OutrageMaxTimer = 3;
        this.name = "Thrash";
        this.type = "Normal";
        this.power = 120;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.makesContact = true;
    }
}
