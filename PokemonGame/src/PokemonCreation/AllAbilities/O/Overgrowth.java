package PokemonCreation.AllAbilities.O;

import Interfaces.CreateOrderedMap;
import PokemonCreation.Abilities;

public class Overgrowth extends Abilities {

    public Overgrowth(){
        this.name = "Overgrowth";
        this.HPReq = (1/3.0);
        this.hasReqsinDamage = true;
        this.affectsSelfType = true;
        this.typesAffected.add(new CreateOrderedMap<>("Grass", 1.5));
    }
}
