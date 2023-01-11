package Moveset.Heal;

import BattleMechanics.Moves;

public class HealingWish extends Moves {
    public HealingWish(){
        this.PP = 10;
        this.savedPP = this.PP;
        this.wish = true;
        this.type = "Psychic";
        this.name = "Healing Wish";
    }
}
