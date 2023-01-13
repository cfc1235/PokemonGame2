package PokemonCreation.AllAbilities.T;

import PokemonCreation.Abilities;

public class ToughClaws extends Abilities {
    public ToughClaws(){
        this.name = "Tough Claws";
        this.isMultiplier = true;
        this.changeSAtt = 1.3;
        this.changeSelfAtt = true;
        this.requiresPhys = true;

    }
}
