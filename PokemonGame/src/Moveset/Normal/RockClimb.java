package Moveset.Normal;

import BattleMechanics.Moves;

public class RockClimb extends Moves {
    public RockClimb(){
        this.name = "Rock Climb";
        this.type = "Normal";
        this.power = 90;
        this.acc = 85;
        this.PP = 20;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.canConfuse = true;
        this.confuseChance = 20;
        this.makesContact = true;
    }
}
