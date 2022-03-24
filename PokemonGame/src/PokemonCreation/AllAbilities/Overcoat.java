package PokemonCreation.AllAbilities;

import PokemonCreation.Abilities;

import java.util.Collections;

public class Overcoat extends Abilities {

    public Overcoat(){
        this.ignoresWeather = true;
        this.ignoresMove = true;
        Collections.addAll(this.ignoresMovesNames,
                "Cotton Spore", "Magic Powder",
                "Poison Powder", "Powder", "Rage Powder",
                "Sleep Powder", "Spore", "Stun Spore");
    }
}
