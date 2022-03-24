package Moveset;

import PokemonCreation.AllAbilities.Insomnia;
import BattleMechanics.Moves;

public class WorrySeed extends Moves {
    public WorrySeed(){
        name = "Worry Seed";
        PP = 10;
        affectsAbilities = true;
        toAbility = new Insomnia();
        affectsBoth = true;
        CanMiss = false;
    }
}
