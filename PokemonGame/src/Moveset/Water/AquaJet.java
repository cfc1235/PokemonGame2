package Moveset.Water;

import BattleMechanics.Moves;

public class AquaJet extends Moves {
    public AquaJet(){
        this.name = "Aqua Jet";
        this.PP = 20;
        this.savedPP = this.PP;
        this.power = 40;
        this.acc = 100;
        this.CanMiss = true;
        this.dealsDamage = true;
        this.makesContact = true;
        this.type = "Water";
        this.goesFirst = true;
    }
}
