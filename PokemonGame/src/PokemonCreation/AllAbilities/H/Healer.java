package PokemonCreation.AllAbilities.H;

import PokemonCreation.Abilities;

public class Healer extends Abilities {
    public Healer(){
        this.name = "Healer";
        this.resolveOnEnd = true;
        this.endsEffects = true;
        this.endResolveChance = .33;
    }
}
