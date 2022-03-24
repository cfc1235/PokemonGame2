package Moveset;

import BattleMechanics.Moves;

public class PlayRough extends Moves {
    public PlayRough(){
        this.name = "Play Rough";
        this.type = "Fairy";
        this.power = 90;
        this.acc = 90;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.StatchangeEnemy = true;
        this.affectsPhysAtt = true;
        this.MultChange = -1;
        this.changeTypeName = " attack ";
        this.makesContact = true;
    }
}
