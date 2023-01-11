package Moveset.Psychic;

import BattleMechanics.Moves;

public class EerieSpell extends Moves {
    public EerieSpell(){
        this.name = "Eerie Spell";
        this.type = "Psychic";
        this.power = 80;
        this.acc = 100;
        this.PP = 5;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP =  this.PP;
        this.isSpecial = true;
    }
}
