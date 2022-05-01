package Moveset.Poison;

import BattleMechanics.Moves;
import PokemonCreation.AllAbilities.E.Empty;

public class GastroAcid extends Moves {

    public GastroAcid(){
        this.name = "Gastro Acid";
        this.PP = 10;
        this.savedPP = this.PP;
        this.affectsAbilities = true;
        this.toAbility = new Empty();
        this.affectsBoth = true;
        this.CanMiss = false;
        this.type = "Poison";
    }
}
