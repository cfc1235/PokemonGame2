package PokemonCreation.AllAbilities;

import Interfaces.CreateOrderedMap;
import PokemonCreation.Abilities;

public class Torrent extends Abilities {
    public Torrent(){
        this.name = "Torrent";
        this.HPReq = (1/3.0);
        this.hasReqsinDamage = true;
        this.affectsSelfType = true;
        this.typesAffected.add(new CreateOrderedMap<>("Water", 1.5));
    }
}
