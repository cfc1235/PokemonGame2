package PokemonCreation.AllAbilities.I;

import PokemonCreation.Abilities;

public class InnerFocus extends Abilities {
    public InnerFocus(){
        this.name = "Inner Focus";
        this.abilitiesCounter = true;
        this.counteringAbilities.add("Intimidate");
        this.noFlinch = true;
    }
}
