package Moveset.Grass;

import BattleMechanics.Moves;

public class PetalBlizzard extends Moves {
    public PetalBlizzard(){
        this.name = "Petal Blizzard";
        this.type = "Grass";
        this.power = 90;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
    }
}
