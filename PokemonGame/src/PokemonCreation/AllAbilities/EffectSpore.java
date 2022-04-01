package PokemonCreation.AllAbilities;

import PokemonCreation.Abilities;

import java.util.Collections;

public class EffectSpore extends Abilities {

    public EffectSpore(){
        this.name = "Effect Spore";
        Collections.addAll(this.causesStatEffect, "Paralyze",
                "Poison", "Sleep");
        this.statChance = .1;
        this.requiresPhys = true;
    }
}
