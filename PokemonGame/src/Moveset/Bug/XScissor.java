package Moveset.Bug;

import BattleMechanics.Moves;

public class XScissor extends Moves {
    public XScissor(){
        this.name = "X-Scissor";
        this.type = "Bug";
        this.makesContact = true;
        this.power = 80;
        this.acc = 100;
        this.CanMiss = true;
        this.dealsDamage = true;
        this.PP = 15;
        this.savedPP = this.PP;
        this.TMNum = 160;
    }
}
