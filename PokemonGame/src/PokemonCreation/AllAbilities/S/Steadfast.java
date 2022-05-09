package PokemonCreation.AllAbilities.S;

import PokemonCreation.Abilities;

public class Steadfast extends Abilities {
    public Steadfast(){
        this.name = "Steadfast";
        this.changeSelfSpeed = true;
        this.changeSSpeed = 2;
        this.onEffect = "Flinch";
    }
}
