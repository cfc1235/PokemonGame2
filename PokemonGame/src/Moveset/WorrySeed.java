package Moveset;

import PokemonCreation.AllAbilities.Insomnia;
import BattleMechanics.Moves;

public class WorrySeed extends Moves {
    public WorrySeed(){
        this.name = "Worry Seed";
        this.PP = 10;
        this.savedPP = this.PP;
        this.affectsAbilities = true;
        this.toAbility = new Insomnia();
        this.affectsBoth = true;
        this.CanMiss = false;
        this.type = "Grass";
    }
}
