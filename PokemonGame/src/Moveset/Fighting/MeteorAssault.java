package Moveset.Fighting;

import BattleMechanics.Moves;

public class MeteorAssault extends Moves {
    public MeteorAssault(){
        this.name = "Meteor Assault";
        this.type = "Fighting";
        this.power = 150;
        this.acc = 100;
        this.PP = 5;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.forcesSitOut = true;
    }
}
