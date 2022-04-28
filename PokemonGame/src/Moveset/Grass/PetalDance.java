package Moveset.Grass;

import BattleMechanics.Moves;

public class PetalDance extends Moves {
    public PetalDance(){
        this.selfConfuse = true;
        this.Outrage = true;
        this.OutrageMinTimer = 2;
        this.OutrageMaxTimer = 3;
        this.name = "Petal Dance";
        this.type = "Grass";
        this.power = 120;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.isSpecial = true;
        this.makesContact = true;
    }
}
