package PokemonCreation.AllAbilities;

import Interfaces.CreateOrderedMap;
import PokemonCreation.Abilities;

public class Swarm extends Abilities {

    public Swarm(){
        this.name = "Swarm";
        this.HPReq = (1/3.0);
        this.hasReqsinDamage = true;
        this.affectsSelfType = true;
        this.typesAffected.add(new CreateOrderedMap<>("Bug", 1.5));
    }
}
