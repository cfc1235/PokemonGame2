package PokemonCreation.AllAbilities;

import PokemonCreation.Abilities;

import java.util.Collections;

public class Intimidate extends Abilities {
    public Intimidate(){
        this.name = "Intimidate";
        this.onStart = true;
        this.changeEnAtt = true;
        this.changeEAtt = -1;
        this.abilitiesCounter = true;
        Collections.addAll(this.counteringAbilities, "Clear Body",
                "Hyper Cutter", "White Smoke");
    }
}
