package PokemonCreation.AllAbilities;

import Interfaces.CreateOrderedMap;
import PokemonCreation.Abilities;

public class ThickFat extends Abilities {

    public ThickFat(){
        this.affectsType = true;
        this.typesAffected.add(new CreateOrderedMap<>("Fire", .5));
        this.typesAffected.add(new CreateOrderedMap<>("Ice", .5));
    }
}
