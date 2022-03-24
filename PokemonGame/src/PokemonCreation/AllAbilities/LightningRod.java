package PokemonCreation.AllAbilities;

import Interfaces.CreateOrderedMap;
import PokemonCreation.Abilities;

public class LightningRod extends Abilities {
    public LightningRod(){
        this.affectsType = true;
        this.typesAffected.add(new CreateOrderedMap<>("Electric", 0.0));
        this.onDealtDamage = true;
        this.requiresType = true;
        this.onMultTypes.add("Electric");
        this.changeSelfSpecAtt = true;
        this.changeSAtt = 1;
    }
}
