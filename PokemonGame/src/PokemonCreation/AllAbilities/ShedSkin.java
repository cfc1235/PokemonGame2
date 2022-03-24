package PokemonCreation.AllAbilities;

import PokemonCreation.Abilities;

public class ShedSkin extends Abilities {
    public ShedSkin(){
        this.name = "Shed Skin";
        this.resolveOnEnd = true;
        this.endsEffects = true;
        this.endResolveChance = .33;
    }
}
