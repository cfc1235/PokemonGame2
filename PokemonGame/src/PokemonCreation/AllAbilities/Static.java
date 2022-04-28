package PokemonCreation.AllAbilities;

import PokemonCreation.Abilities;

import java.util.Collections;

public class Static extends Abilities {
    public Static(){
        this.name = "Static";
        Collections.addAll(this.causesStatEffect, "Paralyze");
        this.statChance = .3;
        this.requiresPhys = true;
    }
}
