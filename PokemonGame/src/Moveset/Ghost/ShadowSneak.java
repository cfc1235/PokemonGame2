package Moveset.Ghost;

import BattleMechanics.Moves;

public class ShadowSneak extends Moves {

    public ShadowSneak(){
        this.goesFirst = true;
        this.PP = 20;
        this.savedPP = this.PP;
        this.power = 40;
        this.makesContact = true;
        this.dealsDamage = true;
        this.acc = 100;
        this.CanMiss = true;
        this.name = "Shadow Sneak";
        this.type = "Ghost";
    }
}
