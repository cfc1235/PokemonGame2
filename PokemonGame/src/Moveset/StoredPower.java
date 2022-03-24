package Moveset;

import BattleMechanics.Moves;

public class StoredPower extends Moves {

    public StoredPower(){
        this.name = "Stored Power";
        this.type = "Psychic";
        this.PP = 10;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.isSpecial = true;
        this.acc = 100;
        this.TMNum = 182;
    }
}
