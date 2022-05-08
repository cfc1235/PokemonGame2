package PokemonCreation.AllAbilities.C;

import PokemonCreation.Abilities;

public class CuteCharm extends Abilities {
    public CuteCharm(){
        this.name = "Cute Charm";
        this.causesStatEffect.add("Infatuate");
        this.requiresPhys = true;
    }
}
