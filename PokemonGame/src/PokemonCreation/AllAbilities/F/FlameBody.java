package PokemonCreation.AllAbilities.F;

import PokemonCreation.Abilities;

import java.util.Collections;

public class FlameBody extends Abilities {
    public FlameBody(){
        this.name = "Flame Body";
        Collections.addAll(this.causesStatEffect, "Burn");
        this.statChance = .3;
        this.requiresPhys = true;
    }
}
