package PokemonCreation.AllAbilities.S;

import Interfaces.CreateOrderedMap;
import PokemonCreation.Abilities;

public class StormDrain extends Abilities {
    public StormDrain(){
        this.name = "Storm Drain";
        this.affectsType = true;
        this.typesAffected.add(new CreateOrderedMap<>("Water", 0.0));
        this.onDealtDamage = true;
        this.requiresType = true;
        this.onMultTypes.add("Water");
        this.changeSelfSpecAtt = true;
        this.changeSAtt = 1;
    }
}
