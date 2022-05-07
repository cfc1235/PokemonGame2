package Moveset.Rock;

import BattleMechanics.Moves;

public class HeadSmash extends Moves {
    public HeadSmash(){
        this.name = "Head Smash";
        this.type = "Rock";
        this.power = 150;
        this.PP = 5;
        this.acc = 80;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.DamageSelf = true;
        this.recoil = .5;
        this.savedPP = this.PP;
        this.makesContact = true;
    }
}
