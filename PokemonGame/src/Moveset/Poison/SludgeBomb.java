package Moveset.Poison;

import BattleMechanics.Moves;

public class SludgeBomb extends Moves {
    public SludgeBomb(){
        this.name = "Sludge Bomb";
        this.type = "Poison";
        this.power = 90;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.isSpecial = true;
        this.TMNum = 122;
        this.canPoison = true;
        this.poisonChance = 30;
    }
}
