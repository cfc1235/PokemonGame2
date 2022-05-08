package PokemonCreation.AllAbilities.O;

import PokemonCreation.Abilities;

import java.util.Collections;

public class Oblivious extends Abilities {
    public Oblivious(){
        this.ignoresMove = true;
        Collections.addAll(this.ignoresMovesNames,
                "Intimidate", "Taunt",
                "Attract");
        this.name = "Oblivious";
    }
}
