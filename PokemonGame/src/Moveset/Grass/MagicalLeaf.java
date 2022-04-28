package Moveset.Grass;

import BattleMechanics.Moves;

public class MagicalLeaf extends Moves {
    public MagicalLeaf(){
        this.name = "Magical Leaf";
        this.type = "Grass";
        this.power = 60;
        this.PP = 20;
        this.dealsDamage = true;
        this.isSpecial = true;
        this.savedPP = this.PP;
        this.TMNum = 10;
    }
}
