package Moveset;

import BattleMechanics.Moves;

public class GastroAcid extends Moves {

    public GastroAcid(){
        this.name = "Gastro Acid";
        this.PP = 10;
        this.savedPP = this.PP;
        this.affectsAbilities = true;
        this.toAbility = new NoAbility();
        this.affectsBoth = true;
        this.CanMiss = false;
        this.type = "Poison";
    }
}
