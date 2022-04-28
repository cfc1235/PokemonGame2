package Moveset.Ghost;

import BattleMechanics.Moves;

public class ShadowClaw extends Moves {
    public ShadowClaw(){
        this.name = "Shadow Claw";
        this.type = "Ghost";
        this.power = 70;
        this.acc = 100;
        this.PP = 15;
        this.savedPP = this.PP;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.makesContact = true;
        this.affectsCrit = true;
        this.Critnum = 1;
        this.TMNum = 65;
    }
}
