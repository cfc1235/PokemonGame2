package Moveset.Psychic;

import BattleMechanics.Moves;

public class ZenHeadbutt extends Moves {
    public ZenHeadbutt(){
        this.name = "Zen Headbutt";
        this.type = "Psychic";
        this.power = 80;
        this.acc = 90;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 169;
        this.canFlinch = true;
        this.FlinchChance = 20;
        this.makesContact = true;
    }
}
