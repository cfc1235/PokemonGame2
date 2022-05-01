package PokemonCreation.AllAbilities.V;

import Interfaces.CreateOrderedMap;
import PokemonCreation.Abilities;

public class VoltAbsorb extends Abilities {
    public VoltAbsorb(){
        this.name = "Volt Absorb";
        this.typesAffected.add(new CreateOrderedMap<>("Electric", 0.0));
        this.affectsType = true;
        this.healOnType = true;
        this.healType = "Electric";
        this.Healback = .25;
        this.DealSelf = true;
    }
}
