package PokemonCreation.AllAbilities.B;

import Interfaces.CreateOrderedMap;
import PokemonCreation.Abilities;

public class Blaze extends Abilities {
    public Blaze(){
        this.name = "Blaze";
        this.HPReq = (1/3.0);
        this.hasReqsinDamage = true;
        this.affectsSelfType = true;
        this.typesAffected.add(new CreateOrderedMap<>("Fire", 1.5));
    }
}
